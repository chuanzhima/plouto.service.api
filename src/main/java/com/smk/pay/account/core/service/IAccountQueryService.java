package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountBizEnum;
import com.smk.pay.account.core.enums.AccountChannelEnum;
import com.smk.pay.account.core.enums.AccountTypeEnum;
import com.smk.pay.account.core.response.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * 查询
 * <p/>
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/23 20:10
 */
public interface IAccountQueryService {

    /**
     * query binded account info by user id
     *
     * @param userId
     * @return
     */
    RpcResponse<ArrayList<AccountInfo>> queryBindedAccountInfo(String userId);

    /**
     * query main account by user id
     *
     * @param userId
     * @return
     */
    RpcResponse<AccountInfo> queryAccountInfoByUserId(String userId);

    /**
     * query single card account by card number
     *
     * @param cardNo
     * @return
     */
    RpcResponse<AccountInfo> queryAccountInfoByCarNo(String cardNo);

    /**
     * query available amount, available amount in AccountInfo will be useful
     *
     * @param value    when type is online, value is userId, otherwise value is cardNumber
     * @param typeEnum refer to AccountTypeEnum
     * @return
     */
    RpcResponse<AccountAvailable> queryAvailableAmount(String value, AccountTypeEnum typeEnum);

    /**
     * query account detail
     *
     * @param value         when type is online, value is userId, otherwise value is cardNumber
     * @param typeEnum      refer to AccountTypeEnum
     * @param transType
     * @param channelEnum
     * @param merchantId
     * @param bizEnum
     * @param fromTransDate
     * @param toTransDate
     * @param pageNum
     * @param pageSize      max size 20
     * @return
     */
    RpcResponse<AccountDetailResp> queryAccountDetail(String value, AccountTypeEnum typeEnum,
                                                      String transType, AccountChannelEnum
                                                              channelEnum, String
                                                              merchantId, AccountBizEnum
                                                              bizEnum, Date fromTransDate, Date
                                                              toTransDate, int pageNum,
                                                      int pageSize);


    /**
     * query account detail
     *
     * @param reqseq
     * @param originalDate
     * @param originalTime
     * @return
     */
    RpcResponse<AccountDetail> queryAccountDetail(String reqseq, String originalDate, String originalTime);
}
