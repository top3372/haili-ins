package com.haili.ins.api.gateway.config;

import com.haili.ins.api.gateway.filter.HeaderEnhanceFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @author super.wu
 */
@Configuration
@EnableAutoConfiguration
public class FilterConfig {

//    @Bean
//    public FilterRegistrationBean headerEnhanceFilterRegistrationBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(headerEnhanceFilter());
//        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        return registrationBean;
//    }
//
//    @Bean
//    public HeaderEnhanceFilter headerEnhanceFilter() {
//        return new HeaderEnhanceFilter();
//    }

}