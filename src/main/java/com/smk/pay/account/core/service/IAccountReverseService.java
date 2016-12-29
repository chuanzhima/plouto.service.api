package com.smk.pay.account.core.service;

import com.smk.pay.account.core.request.RequestHeader;
import com.smk.pay.account.core.response.RpcResponse;

import java.util.Map;

/**
 * 冲正
 * <p/>
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/12 14:50
 */
public interface IAccountReverseService {
    /**
     * @param header
     * @param originalSeq
     * @param originalDate
     * @param originalTime
     * @param extraParam
     * @return
     */
    RpcResponse<String> reverse(RequestHeader header, String originalSeq, String originalDate, String originalTime,
                                Map<String, Object> extraParam);

}
