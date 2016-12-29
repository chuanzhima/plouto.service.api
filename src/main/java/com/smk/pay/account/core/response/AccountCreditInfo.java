package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/15 15:41
 */
public class AccountCreditInfo implements Serializable {

    private static final long serialVersionUID = 9045264539080385750L;
    // 是否开通信用支付
    private Boolean isOpened;
    // 卡号
    private String cardNumber;
    // 姓名
    private String custName;
    // 可用信用额度
    private BigDecimal availableAmt;
    // 欠款金额
    private BigDecimal debtAmt;
    // 欠款利息
    private BigDecimal debtInterestAmt;
    // 账户总金额
    private BigDecimal totalAmt;

    public AccountCreditInfo() {
        super();
    }

    public AccountCreditInfo(Boolean isOpened) {
        this.isOpened = isOpened;
    }

    public AccountCreditInfo(Boolean isOpened, String cardNumber, String custName) {
        this.isOpened = isOpened;
        this.cardNumber = cardNumber;
        this.custName = custName;
    }

    public AccountCreditInfo(Boolean isOpened, String cardNumber, String custName, BigDecimal availableAmt,
                             BigDecimal debtAmt, BigDecimal debtInterestAmt, BigDecimal totalAmt) {
        this.isOpened = isOpened;
        this.cardNumber = cardNumber;
        this.custName = custName;
        this.availableAmt = availableAmt;
        this.debtAmt = debtAmt;
        this.debtInterestAmt = debtInterestAmt;
        this.totalAmt = totalAmt;
    }

    public Boolean getIsOpened() {
        return isOpened;
    }

    public void setIsOpened(Boolean isOpened) {
        this.isOpened = isOpened;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public BigDecimal getAvailableAmt() {
        return availableAmt;
    }

    public void setAvailableAmt(BigDecimal availableAmt) {
        this.availableAmt = availableAmt;
    }

    public BigDecimal getDebtAmt() {
        return debtAmt;
    }

    public void setDebtAmt(BigDecimal debtAmt) {
        this.debtAmt = debtAmt;
    }

    public BigDecimal getDebtInterestAmt() {
        return debtInterestAmt;
    }

    public void setDebtInterestAmt(BigDecimal debtInterestAmt) {
        this.debtInterestAmt = debtInterestAmt;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }
}
