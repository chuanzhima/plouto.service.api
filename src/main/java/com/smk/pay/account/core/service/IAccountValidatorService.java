package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.enums.AccountFundFlowEnum;
import com.smk.pay.account.core.enums.AccountTypeEnum;
import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

import java.math.BigDecimal;

/**
 * 账户校验接口
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/26 16:37
 */
public interface IAccountValidatorService {

    /**
     * 充值校验
     *
     * @param header       头信息
     * @param typeEnum     类型，线上or线下
     * @param channelEnum  渠道类型
     * @param typeVal      类型值，线上=custId,线下=cardNumber
     * @param fundFlowEnum 资金来源
     * @param amount       金额
     * @return
     */
    RpcResponse<String> validate4Recharge(RequestHeader header, AccountTypeEnum typeEnum, AccountChannelEnum channelEnum,
                                          String typeVal,
                                          AccountFundFlowEnum fundFlowEnum, BigDecimal amount);

    /**
     * 消费校验
     *
     * @param header    头信息
     * @param typeEnum  类型，线上or线下
     * @param typeValue 类型值，线上=custId,线下=cardNumber
     * @param amount    金额
     * @return
     */
    RpcResponse<String> validate4Consume(RequestHeader header, AccountTypeEnum typeEnum, String typeValue,
                                         BigDecimal amount);

    /**
     * 提现校验
     *
     * @param header    头信息
     * @param typeEnum  类型，线上or线下
     * @param typeValue 类型值，线上=custId,线下=cardNumber
     * @param amount    金额
     * @return
     */
    RpcResponse<String> validate4Withdraw(RequestHeader header, AccountTypeEnum typeEnum, String typeValue,
                                          BigDecimal amount);


}
