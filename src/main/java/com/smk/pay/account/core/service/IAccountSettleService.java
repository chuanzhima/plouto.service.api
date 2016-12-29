package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountBizEnum;
import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.enums.AccountFundFlowEnum;
import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

import java.math.BigDecimal;

/**
 * 结算
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/12 14:44
 */
public interface IAccountSettleService {

    /**
     * 商户结算
     *
     * @param header
     * @param channelEnum
     * @param merchantId
     * @param fundFlowEnum
     * @param amount
     * @param bankId
     * @param bizEnum
     * @return
     */
    RpcResponse<String> settle4Merchant(RequestHeader header, AccountChannelEnum channelEnum, String merchantId,
                                        AccountFundFlowEnum fundFlowEnum, BigDecimal amount, String bankId,
                                        AccountBizEnum bizEnum);

    /**
     * 商户代理支付
     *
     * @param header
     * @param channelEnum
     * @param merchantId
     * @param fundFlowEnum
     * @param amount
     * @param bankId
     * @param bizEnum
     * @return
     */
    RpcResponse<String> agentPay(RequestHeader header, AccountChannelEnum channelEnum, String merchantId,
                                 AccountFundFlowEnum fundFlowEnum, BigDecimal amount, String bankId,
                                 AccountBizEnum bizEnum);
}
