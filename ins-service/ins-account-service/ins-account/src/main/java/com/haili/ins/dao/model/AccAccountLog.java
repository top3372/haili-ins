package com.haili.ins.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import lombok.Data;

/**
 * Table: T_ACC_ACCOUNT_LOG
 */
@Table(name = "`T_ACC_ACCOUNT_LOG`")
@Data
public class AccAccountLog implements Serializable {
    /**
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    ACC_SEQ_NO
     * Nullable:  false
     */
    @Id
    @Column(name = "`ACC_SEQ_NO`")
    private String accSeqNo;

    /**
     * 系统跟踪号
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    SYS_TRACE_NO
     * Nullable:  true
     */
    @Column(name = "`SYS_TRACE_NO`")
    private String sysTraceNo;

    /**
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    CLEAR_DATE
     * Nullable:  true
     */
    @Column(name = "`CLEAR_DATE`")
    private String clearDate;

    /**
     * 交易时间
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    TXN_TIME
     * Nullable:  true
     */
    @Column(name = "`TXN_TIME`")
    private Date txnTime;

    /**
     * 账户号码
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    ACCOUNT_NO
     * Nullable:  true
     */
    @Column(name = "`ACCOUNT_NO`")
    private String accountNo;

    /**
     * 交易代码
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    TXN_CODE
     * Nullable:  true
     */
    @Column(name = "`TXN_CODE`")
    private String txnCode;

    /**
     * 交易类型:
     * 0:正常
     * 1:红字
     * 2:蓝字
     * <p>
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    TXN_TYPE
     * Nullable:  true
     */
    @Column(name = "`TXN_TYPE`")
    private String txnType;

    /**
     * 交易摘要
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    TXN_DSCPT
     * Nullable:  true
     */
    @Column(name = "`TXN_DSCPT`")
    private String txnDscpt;

    /**
     * 币种代码
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    TXN_CURRENCY_CODE
     * Nullable:  true
     */
    @Column(name = "`TXN_CURRENCY_CODE`")
    private String txnCurrencyCode;

    /**
     * 借贷标志:
     * D:借
     * C:贷
     * 0-无
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    DIRECTION
     * Nullable:  true
     */
    @Column(name = "`DIRECTION`")
    private String direction;

    /**
     * 交易金额
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    TXN_AMT
     * Nullable:  true
     */
    @Column(name = "`TXN_AMT`")
    private BigDecimal txnAmt;

    /**
     * 交易前余额
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    BEFORE_AMT
     * Nullable:  true
     */
    @Column(name = "`BEFORE_AMT`")
    private BigDecimal beforeAmt;

    /**
     * 交易后余额
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    AFTER_AMT
     * Nullable:  true
     */
    @Column(name = "`AFTER_AMT`")
    private BigDecimal afterAmt;

    /**
     * 分录流水号
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    ENTRY_SEQ_NO
     * Nullable:  true
     */
    @Column(name = "`ENTRY_SEQ_NO`")
    private String entrySeqNo;

    /**
     * 关联流水
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    REF_ACC_SEQ_NO
     * Nullable:  true
     */
    @Column(name = "`REF_ACC_SEQ_NO`")
    private String refAccSeqNo;

    /**
     * 关联账号
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    REF_ACCOUNT_NO
     * Nullable:  true
     */
    @Column(name = "`REF_ACCOUNT_NO`")
    private String refAccountNo;

    /**
     * 原流水号
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    OLD_ACC_SEQ_NO
     * Nullable:  true
     */
    @Column(name = "`OLD_ACC_SEQ_NO`")
    private String oldAccSeqNo;

    /**
     * 状态标识位：
     * 第一位：红字标识
     * 0-未红字
     * 1-已红字
     * 第二位：蓝字标识
     * 0-未蓝字
     * 1-已蓝字
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    STATUS_MAP
     * Nullable:  true
     */
    @Column(name = "`STATUS_MAP`")
    private String statusMap;

    /**
     * 备注
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    REMARK
     * Nullable:  true
     */
    @Column(name = "`REMARK`")
    private String remark;

    /**
     * 预留金额字段1
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    RSVD_AMT1
     * Nullable:  true
     */
    @Column(name = "`RSVD_AMT1`")
    private BigDecimal rsvdAmt1;

    /**
     * 预留金额字段2
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    RSVD_AMT2
     * Nullable:  true
     */
    @Column(name = "`RSVD_AMT2`")
    private BigDecimal rsvdAmt2;

    /**
     * 预留文本字段1
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    RSVD_TEXT1
     * Nullable:  true
     */
    @Column(name = "`RSVD_TEXT1`")
    private String rsvdText1;

    /**
     * 预留文本字段2
     * <p>
     * Table:     T_ACC_ACCOUNT_LOG
     * Column:    RSVD_TEXT2
     * Nullable:  true
     */
    @Column(name = "`RSVD_TEXT2`")
    private String rsvdText2;

    private static final long serialVersionUID = 1L;
}