package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.util.List;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/16 11:14
 */
public class AccountCreditDetailResp extends BasePageResp<AccountCreditDetail> implements Serializable {

    public AccountCreditDetailResp() {

    }

    public AccountCreditDetailResp(List<AccountCreditDetail> infoList, int pageSize, int pageCount, int count) {
        super(infoList, pageSize, pageCount, count);
    }
}
