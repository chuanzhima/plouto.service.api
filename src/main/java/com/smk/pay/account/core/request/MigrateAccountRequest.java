package com.smk.pay.account.core.request;

import com.smk.pay.account.core.enums.AccountCardTypeEnum;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/18 16:52
 */
public class MigrateAccountRequest implements Serializable {


    private AccountCardTypeEnum cardType;

    private String cardNumber;

    /**
     * default "1" as identity card, refer to AccountConstant.CREDENTIAL_TYPE_ID
     */
    private String custCredentialType;

    private String custCredentialNo;

    private BigDecimal xjAmount;

    private BigDecimal cgAmount;

    private BigDecimal zxzjAmount;

    private BigDecimal ggkAmount;

    private BigDecimal guaranteeAmount;


    public MigrateAccountRequest() {

    }

    public MigrateAccountRequest(AccountCardTypeEnum cardType, String cardNumber, String custCredentialType, String custCredentialNo) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.custCredentialType = custCredentialType;
        this.custCredentialNo = custCredentialNo;
    }

    public MigrateAccountRequest(AccountCardTypeEnum cardType, String cardNumber, String custCredentialType, String custCredentialNo, BigDecimal xjAmount, BigDecimal cgAmount, BigDecimal zxzjAmount, BigDecimal ggkAmount, BigDecimal guaranteeAmount) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.custCredentialType = custCredentialType;
        this.custCredentialNo = custCredentialNo;
        this.xjAmount = xjAmount;
        this.cgAmount = cgAmount;
        this.zxzjAmount = zxzjAmount;
        this.ggkAmount = ggkAmount;
        this.guaranteeAmount = guaranteeAmount;
    }

    public AccountCardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(AccountCardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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

    public BigDecimal getXjAmount() {
        return xjAmount;
    }

    public void setXjAmount(BigDecimal xjAmount) {
        this.xjAmount = xjAmount;
    }

    public BigDecimal getCgAmount() {
        return cgAmount;
    }

    public void setCgAmount(BigDecimal cgAmount) {
        this.cgAmount = cgAmount;
    }

    public BigDecimal getZxzjAmount() {
        return zxzjAmount;
    }

    public void setZxzjAmount(BigDecimal zxzjAmount) {
        this.zxzjAmount = zxzjAmount;
    }

    public BigDecimal getGgkAmount() {
        return ggkAmount;
    }

    public void setGgkAmount(BigDecimal ggkAmount) {
        this.ggkAmount = ggkAmount;
    }

    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }
}
