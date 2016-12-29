package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountBizEnum;
import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.enums.AccountTypeEnum;
import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 消费
 * <p/>
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/4 11:32
 */
public interface IAccountConsumeService {

    /**
     * consume
     *
     * @param header
     * @param channelEnum
     * @param bizEnum
     * @param merchantId
     * @param typeEnum
     * @param typeValue
     * @param amount
     * @param cost
     * @param extraParam
     * @return
     */
    RpcResponse<String> consume(RequestHeader header, AccountChannelEnum channelEnum, AccountBizEnum bizEnum,
                                String merchantId, AccountTypeEnum typeEnum, String typeValue,
                                BigDecimal amount, BigDecimal cost, Map<String, Object> extraParam);

}
