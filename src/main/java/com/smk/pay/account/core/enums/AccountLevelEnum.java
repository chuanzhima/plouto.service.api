package com.smk.pay.account.core.enums;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/28 16:58
 */
public enum AccountLevelEnum {
    /**
     * 一类账户
     */
    FIRST("1"),

    /**
     * 二类账户
     */
    SECOND("2"),
    /**
     * 三类账户
     */
    THIRD("3");

    private String value;

    AccountLevelEnum(String value) {
        this.value = value;
    }

    public static AccountLevelEnum get(String value) {
        AccountLevelEnum[] levelEnums = AccountLevelEnum.values();
        for (AccountLevelEnum levelEnum : levelEnums) {
            if (levelEnum.value().equals(value)) {
                return levelEnum;
            }
        }
        return null;
    }

    public String value() {
        return value;
    }
}
