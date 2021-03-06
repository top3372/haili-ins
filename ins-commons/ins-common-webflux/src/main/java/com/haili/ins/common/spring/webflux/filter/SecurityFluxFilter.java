package com.haili.ins.common.spring.webflux.filter;

import com.haili.ins.common.constants.HailiInsConstant;
import com.haili.ins.common.constants.HttpHeaderConstant;
import com.haili.ins.common.utils.JSONUtil;
import com.haili.ins.common.utils.JWTUtils;
import com.haili.ins.common.vo.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

/**
 * @Author: leon
 * @Date: 2019/4/10 23:27
 * @Version 1.0
 */
//@Configuration
//@Order(0)
@Slf4j
public class SecurityFluxFilter implements WebFilter {


    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange,
                             WebFilterChain webFilterChain) {
        log.info(" 开始SecurityFluxFilter调用 : ");
        ServerHttpRequest serverHttpRequest = serverWebExchange.getRequest();
        ServerHttpResponse serverHttpResponse = serverWebExchange.getResponse();
        String url = serverHttpRequest.getURI().toString();
        log.info("请求uri: " + url);
        //获取请求http头xttblog_token值
        String token = serverHttpRequest.getHeaders().getFirst(HttpHeaderConstant.SECURITY_TOKEN);
        if (StringUtils.isNotEmpty(token)) {
            log.info("接收到的token: " + token);
            String responseCode = JWTUtils.verifyToken(token);
            if (HailiInsConstant.SUCCESS.equals(responseCode)) {
                return webFilterChain.filter(serverWebExchange);
            } else {
                serverHttpResponse.setStatusCode(HttpStatus.UNAUTHORIZED);
                return serverHttpResponse
                        .writeWith(Mono.just(new DefaultDataBufferFactory().wrap(JSONUtil.toJson(new ResultInfo(HailiInsConstant.VERIFY_ERROR, "服务调用token验证失败")).getBytes())));
            }
        } else {
            serverHttpResponse.setStatusCode(HttpStatus.UNAUTHORIZED);
            return serverHttpResponse
                    .writeWith(Mono.just(new DefaultDataBufferFactory().wrap(JSONUtil.toJson(new ResultInfo(HailiInsConstant.VERIFY_ERROR, "服务调用token不存在")).getBytes())));

        }


    }
}
