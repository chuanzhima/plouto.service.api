package com.smk.pay.account.core.service;

import com.smk.pay.account.core.enums.AccountTypeEnum;
import com.smk.pay.account.core.response.AccountCreditDetailResp;
import com.smk.pay.account.core.response.AccountCreditInfo;
import com.smk.pay.account.core.response.RpcResponse;

import java.util.Date;

/**
 * 信用查询服务
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/15 15:38
 */
public interface IAccountCreditQueryService {

    /**
     * 贷款
     */
    String LOAN = "L";
    /**
     * 还款
     */
    String REPAYMENT = "R";

    /**
     * 信用基本信息查询
     *
     * @param typeEnum
     * @param value    当typeEnum = ONLINE时，value = 客户id, 当typeEnum=OFFLINE时，value=卡号
     * @return
     */
    RpcResponse<AccountCreditInfo> queryAccountCreditInfo(AccountTypeEnum typeEnum, String value);

    /**
     * 信用借/还款明细
     *
     * @param transFromDate 明细开始时间
     * @param transToDate   明细结束时间
     * @param cardNumber    卡号
     * @param idNo          身份证号
     * @param type          LOAN OR REPAYMENT
     * @param pageNum       当前页数
     * @param pageSize      每页条数
     * @return
     */
    RpcResponse<AccountCreditDetailResp> queryAccountCreditDetail(Date transFromDate, Date transToDate, String
            cardNumber, String idNo, String type, int pageNum, int pageSize);

}
