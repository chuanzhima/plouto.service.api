package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/15 17:47
 */
public class AccountCreditDetail implements Serializable {


    private static final long serialVersionUID = 3937605311023045344L;
    // 交易时间
    private String transDate;
    // 借/贷款 参考 IAccountCreditQueryService常量
    private String type;
    // 本金
    private BigDecimal principal;
    // 利息
    private BigDecimal interest;
    // 用户名
    private String custName;
    // 卡号
    private String cardNo;
    // 状态 目前只有正常=1
    private String status;
    // 身份证号
    private String idNo;
    // 手机号码
    private String mobile;

    public AccountCreditDetail() {

    }

    public AccountCreditDetail(String transDate, String type, BigDecimal principal, BigDecimal interest, String custName, String cardNo, String status, String idNo, String mobile) {
        this.transDate = transDate;
        this.type = type;
        this.principal = principal;
        this.interest = interest;
        this.custName = custName;
        this.cardNo = cardNo;
        this.status = status;
        this.idNo = idNo;
        this.mobile = mobile;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
