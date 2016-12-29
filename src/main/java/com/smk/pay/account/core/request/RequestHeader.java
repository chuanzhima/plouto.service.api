package com.smk.pay.account.core.request;

import java.io.Serializable;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/10/28 16:02
 */
public class RequestHeader implements Serializable {

    private static final long serialVersionUID = 3927381689283597351L;

    public String txDate;

    public String txTime;

    public String reqSeq;

    public RequestHeader() {
        super();
    }

    public RequestHeader(String txDate, String txTime, String reqSeq) {
        this.txDate = txDate;
        this.txTime = txTime;
        this.reqSeq = reqSeq;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public String getTxTime() {
        return txTime;
    }

    public void setTxTime(String txTime) {
        this.txTime = txTime;
    }

    public String getReqSeq() {
        return reqSeq;
    }

    public void setReqSeq(String reqSeq) {
        this.reqSeq = reqSeq;
    }
}
