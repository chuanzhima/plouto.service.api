package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/28 16:59
 */
public class AccountAvailable implements Serializable {

    /**
     * available amount to consume
     */
    private BigDecimal consumeableAmount;

    /**
     * available amount to ggk recharge
     */
    private BigDecimal rechargeableGGKAmount;

    public AccountAvailable() {

    }

    private AccountAvailable(Builder builder) {
        setConsumeableAmount(builder.consumeableAmount);
        setRechargeableGGKAmount(builder.rechargeableGGKAmount);
    }


    public BigDecimal getConsumeableAmount() {
        return consumeableAmount;
    }

    public void setConsumeableAmount(BigDecimal consumeableAmount) {
        this.consumeableAmount = consumeableAmount;
    }

    public BigDecimal getRechargeableGGKAmount() {
        return rechargeableGGKAmount;
    }

    public void setRechargeableGGKAmount(BigDecimal rechargeableGGKAmount) {
        this.rechargeableGGKAmount = rechargeableGGKAmount;
    }

    public static final class Builder {
        private BigDecimal consumeableAmount;
        private BigDecimal rechargeableGGKAmount;

        public Builder() {
        }

        public Builder consumeableAmount(BigDecimal consumeableAmount) {
            this.consumeableAmount = consumeableAmount;
            return this;
        }

        public Builder rechargeableGGKAmount(BigDecimal rechargeableGGKAmount) {
            this.rechargeableGGKAmount = rechargeableGGKAmount;
            return this;
        }

        public AccountAvailable build() {
            return new AccountAvailable(this);
        }
    }
}
