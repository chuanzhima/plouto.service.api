package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/28 16:25
 */
public class AccountInfo implements Serializable {

    private static final long serialVersionUID = 1201070915573277847L;

    private String accountId;

    private String cardNo;

    /**
     * refer to AccountLevelEnum
     */
    private String accountClass;

    /**
     * refer to AccountTypeEnum
     */
    private String accountType;

    /**
     * refer to AccountInfoStatusEnum
     */
    private String status;

    private Date createDate;

    private Date lastUpdateDate;

    /**
     * withdrawal amount of xj
     */
    private BigDecimal withdrawalAmount4XJ;
    /**
     * withdrawal amount of yhk
     */
    private BigDecimal withdrawalAmount4YHK;

    /**
     * total amount of this account
     */
    private BigDecimal currentTotalAmount;

    /**
     * refer to AccountConstant.CARD_CATEGORY_*
     */
    private String productId;

    public AccountInfo() {

    }

    private AccountInfo(Builder builder) {
        setAccountId(builder.accountId);
        setCardNo(builder.cardNo);
        setAccountClass(builder.accountClass);
        setAccountType(builder.accountType);
        setStatus(builder.status);
        setCreateDate(builder.createDate);
        setLastUpdateDate(builder.lastUpdateDate);
        setWithdrawalAmount4XJ(builder.withdrawalAmount4XJ);
        setWithdrawalAmount4YHK(builder.withdrawalAmount4YHK);
        setCurrentTotalAmount(builder.currentTotalAmount);
        setProductId(builder.productId);
    }


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAccountClass() {
        return accountClass;
    }

    public void setAccountClass(String accountClass) {
        this.accountClass = accountClass;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getWithdrawalAmount4XJ() {
        return withdrawalAmount4XJ;
    }

    public void setWithdrawalAmount4XJ(BigDecimal withdrawalAmount4XJ) {
        this.withdrawalAmount4XJ = withdrawalAmount4XJ;
    }

    public BigDecimal getWithdrawalAmount4YHK() {
        return withdrawalAmount4YHK;
    }

    public void setWithdrawalAmount4YHK(BigDecimal withdrawalAmount4YHK) {
        this.withdrawalAmount4YHK = withdrawalAmount4YHK;
    }

    public BigDecimal getCurrentTotalAmount() {
        return currentTotalAmount;
    }

    public void setCurrentTotalAmount(BigDecimal currentTotalAmount) {
        this.currentTotalAmount = currentTotalAmount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountInfo{");
        sb.append("accountId='").append(accountId).append('\'');
        sb.append(", accountClass='").append(accountClass).append('\'');
        sb.append(", accountType='").append(accountType).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", currentTotalAmount=").append(currentTotalAmount);
        sb.append(", productId='").append(productId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {
        private String accountId;
        private String cardNo;
        private String accountClass;
        private String accountType;
        private String status;
        private Date createDate;
        private Date lastUpdateDate;
        private BigDecimal withdrawalAmount4XJ;
        private BigDecimal withdrawalAmount4YHK;
        private BigDecimal currentTotalAmount;
        private String productId;

        public Builder() {
        }

        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountClass(String accountClass) {
            this.accountClass = accountClass;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder createDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }

        public Builder lastUpdateDate(Date lastUpdateDate) {
            this.lastUpdateDate = lastUpdateDate;
            return this;
        }

        public Builder withdrawalAmount4XJ(BigDecimal withdrawalAmount4XJ) {
            this.withdrawalAmount4XJ = withdrawalAmount4XJ;
            return this;
        }

        public Builder withdrawalAmount4YHK(BigDecimal withdrawalAmount4YHK) {
            this.withdrawalAmount4YHK = withdrawalAmount4YHK;
            return this;
        }

        public Builder currentTotalAmount(BigDecimal currentTotalAmount) {
            this.currentTotalAmount = currentTotalAmount;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public String getCardNo() {
            return cardNo;
        }

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public AccountInfo build() {
            return new AccountInfo(this);
        }
    }
}
