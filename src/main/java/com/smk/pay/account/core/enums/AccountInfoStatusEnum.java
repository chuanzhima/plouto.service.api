package com.smk.pay.account.core.enums;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/7 14:04
 */
public enum AccountInfoStatusEnum {

    /**
     * 注销
     */
    CANCEL("0"),
    /**
     * 正常
     */
    NORMAL("1"),
    /**
     * 已冻结
     */
    FROZEN("2"),

    /**
     * 已绑定
     */
    BINDED("3"),

    /**
     * 未激活
     */
    UNACTIVATED("5");


    private String value;

    AccountInfoStatusEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
