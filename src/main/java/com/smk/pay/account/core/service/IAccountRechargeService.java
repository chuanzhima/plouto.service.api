package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.enums.AccountFundFlowEnum;
import com.smk.pay.account.core.enums.AccountTypeEnum;
import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

import java.math.BigDecimal;

/**
 * 充值
 * <p/>
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/4 11:27
 */
public interface IAccountRechargeService {

    /**
     * 个人充值
     *
     * @param header
     * @param channelEnum
     * @param merchantId
     * @param typeEnum
     * @param typeValue
     * @param fundFlowEnum
     * @param amount
     * @param bankId
     * @param companyId
     * @return
     */
    RpcResponse<String> recharge(RequestHeader header, AccountChannelEnum channelEnum,
                                 String merchantId, AccountTypeEnum typeEnum,
                                 String typeValue, AccountFundFlowEnum fundFlowEnum,
                                 BigDecimal amount, String bankId, String companyId);

    /**
     * 商户充值
     *
     * @param header
     * @param channelEnum
     * @param merchantId
     * @param fundFlowEnum
     * @param amount
     * @param bankId
     * @return
     */
    RpcResponse<String> recharge4Merchant(RequestHeader header, AccountChannelEnum channelEnum, String merchantId,
                                          AccountFundFlowEnum fundFlowEnum, BigDecimal amount, String bankId);
}
