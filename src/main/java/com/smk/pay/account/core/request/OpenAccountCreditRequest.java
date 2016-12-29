package com.smk.pay.account.core.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/15 17:27
 */
public class OpenAccountCreditRequest implements Serializable {


    private static final long serialVersionUID = 8069410830581701531L;

    private String custName;

    private String custId;

    private String custCredentialType;

    private String custCredentialNo;

    private String mobile;
    /**
     * 授信额度
     */
    private BigDecimal creditAmt;

    public OpenAccountCreditRequest() {

    }

    public OpenAccountCreditRequest(String custName, String custId, String custCredentialType, String custCredentialNo, String mobile, BigDecimal creditAmt) {
        this.custName = custName;
        this.custId = custId;
        this.custCredentialType = custCredentialType;
        this.custCredentialNo = custCredentialNo;
        this.mobile = mobile;
        this.creditAmt = creditAmt;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustCredentialType() {
        return custCredentialType;
    }

    public void setCustCredentialType(String custCredentialType) {
        this.custCredentialType = custCredentialType;
    }

    public String getCustCredentialNo() {
        return custCredentialNo;
    }

    public void setCustCredentialNo(String custCredentialNo) {
        this.custCredentialNo = custCredentialNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt) {
        this.creditAmt = creditAmt;
    }
}
