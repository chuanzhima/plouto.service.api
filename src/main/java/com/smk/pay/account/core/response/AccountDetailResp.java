package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.util.List;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/17 17:38
 */
public class AccountDetailResp extends BasePageResp<AccountDetail> implements Serializable {

    public AccountDetailResp() {

    }

    public AccountDetailResp(List<AccountDetail> infoList, int pageSize, int pageCount, int count) {
        super(infoList, pageSize, pageCount, count);
    }
}

