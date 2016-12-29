package com.smk.pay.account.core.response;

import java.io.Serializable;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/23 20:03
 */
public class RpcResponse<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 958551345410824884L;

    private String resultCode;

    private String resultMsg;

    private Boolean isSucc = true;

    private T t;

    public RpcResponse() {
        super();
    }

    public RpcResponse(Boolean isSucc) {
        this.isSucc = isSucc;
    }

    public RpcResponse(T t, Boolean isSucc) {
        this.t = t;
        this.isSucc = isSucc;
    }

    public RpcResponse(Boolean isSucc, String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.isSucc = isSucc;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Boolean getIsSucc() {
        return isSucc;
    }


    public void setIsSucc(Boolean isSucc) {
        this.isSucc = isSucc;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "ServiceResultResponse{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                ", isSucc=" + isSucc +
                ", t=" + t +
                '}';
    }
}
