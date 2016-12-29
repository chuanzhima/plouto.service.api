package com.smk.pay.account.core.enums;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/23 20:05
 */

public enum AccountTypeEnum {
    /**
     * 线上
     */
    ONLINE("2"),
    /**
     * 线下
     */
    OFFLINE("1");

    private String value;

    AccountTypeEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}

