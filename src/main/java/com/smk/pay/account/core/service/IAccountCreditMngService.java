package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.request.OpenAccountCreditRequest;
import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

/**
 * 信用管理服务
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/15 15:39
 */
public interface IAccountCreditMngService {

    /**
     * 开通信用服务
     *
     * @param header
     * @param channelEnum
     * @param request
     */
    RpcResponse<String> openAccountCredit(RequestHeader header, AccountChannelEnum channelEnum, OpenAccountCreditRequest request);
}
