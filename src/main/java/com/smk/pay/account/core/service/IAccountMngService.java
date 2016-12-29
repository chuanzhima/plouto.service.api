package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.enums.AccountLevelEnum;
import com.smk.pay.account.core.enums.AccountTypeEnum;
import com.smk.pay.account.core.request.MigrateAccountRequest;
import com.smk.pay.account.core.request.OpenAccountRequest;
import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

/**
 * 账户管理
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/23 20:06
 */
public interface IAccountMngService {

    /**
     * 账户开户
     *
     * @param openAccountRequest
     * @param typeEnum
     * @return
     */
    RpcResponse<String> openAccount(OpenAccountRequest openAccountRequest, AccountTypeEnum typeEnum);

    /**
     * 变更账户等级
     *
     * @param custId    客户id
     * @param levelEnum
     * @return
     */
    RpcResponse<String> alterAccountLevel(String custId, AccountLevelEnum levelEnum);

    /**
     * 账户注销
     *
     * @param value    when type = 2 value is userId otherwise value is cardNumber
     * @param typeEnum
     * @return
     */
    RpcResponse<String> closeAccount(String value, AccountTypeEnum typeEnum);

    /**
     * 账户绑定
     *
     * @param header
     * @param userId
     * @param cardNo
     * @param merchantId
     * @param channelEnum
     * @return
     */
    RpcResponse<String> bindAccount(RequestHeader header, String userId, String cardNo, String
            merchantId, AccountChannelEnum channelEnum);


    /**
     * 账户迁移
     *
     * @param header
     * @param merchantId
     * @param channelEnum
     * @param request
     * @return
     */
    RpcResponse<String> migrateAccount(RequestHeader header, String merchantId,
                                       AccountChannelEnum channelEnum, MigrateAccountRequest request);

}
