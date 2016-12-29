package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/17 17:00
 */
public class AccountDetail implements Serializable {

    private static final long serialVersionUID = 1323568124449860247L;

    private String merchantId;

    private Date transDate;

    private String transType;

    private String transTypeName;

    private String userDefindMark;

    private String userDefindMarkAlias;

    private BigDecimal detailAmount;

    private BigDecimal accountAmount;

    private String status;

    public AccountDetail() {

    }

    public AccountDetail(String merchantId, Date transDate, String transType, String transTypeName, String userDefindMark, String userDefindMarkAlias, BigDecimal detailAmount, BigDecimal accountAmount, String status) {
        this.merchantId = merchantId;
        this.transDate = transDate;
        this.transType = transType;
        this.transTypeName = transTypeName;
        this.userDefindMark = userDefindMark;
        this.userDefindMarkAlias = userDefindMarkAlias;
        this.detailAmount = detailAmount;
        this.accountAmount = accountAmount;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransTypeName() {
        return transTypeName;
    }

    public void setTransTypeName(String transTypeName) {
        this.transTypeName = transTypeName;
    }

    public String getUserDefindMark() {
        return userDefindMark;
    }

    public void setUserDefindMark(String userDefindMark) {
        this.userDefindMark = userDefindMark;
    }

    public String getUserDefindMarkAlias() {
        return userDefindMarkAlias;
    }

    public void setUserDefindMarkAlias(String userDefindMarkAlias) {
        this.userDefindMarkAlias = userDefindMarkAlias;
    }

    public BigDecimal getDetailAmount() {
        return detailAmount;
    }

    public void setDetailAmount(BigDecimal detailAmount) {
        this.detailAmount = detailAmount;
    }

    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }
}
