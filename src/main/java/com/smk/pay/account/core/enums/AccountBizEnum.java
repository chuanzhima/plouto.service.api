package com.smk.pay.account.core.enums;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/28 18:54
 */
public enum AccountBizEnum {

    /**
     * 普通业务
     */
    NORMAL("00"),

    /**
     * 老年业务
     */
    ELDER("01"),

    /**
     * 信用业务
     */
    CREDIT("02");

    private String value;

    AccountBizEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
