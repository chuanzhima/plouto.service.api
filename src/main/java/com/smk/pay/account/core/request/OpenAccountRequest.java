package com.smk.pay.account.core.request;

import java.io.Serializable;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/11/3 10:05
 */
public class OpenAccountRequest implements Serializable {


    /**
     * open personal account
     */
    public static final String OPEN_ACCOUNT_PERSONAL = "1";
    /**
     * open merchant account
     */
    public static final String OPEN_ACCOUNT_MERCHANT = "2";
    private static final long serialVersionUID = -3929706537493122630L;
    /**
     * refer to upper OPEN_ACCOUNT_*
     */
    private String userCls;

    private String custId;

    private String custName;
    /**
     * default "1" as identity card, refer to AccountConstant.CREDENTIAL_TYPE_ID
     */
    private String custCredentialType;

    private String custCredentialNo;

    /**
     * when userCls = OPEN_ACCOUNT_MERCHANT, merchant info is required
     */
    private String merchantNo;

    private String merchantName;


    public OpenAccountRequest() {
        super();
    }

    public OpenAccountRequest(String merchantNo, String merchantName) {
        this.merchantNo = merchantNo;
        this.merchantName = merchantName;
    }

    public OpenAccountRequest(String custId, String custName, String custCredentialType, String
            custCredentialNo) {
        this.custId = custId;
        this.custName = custName;
        this.custCredentialType = custCredentialType;
        this.custCredentialNo = custCredentialNo;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCredentialType() {
        return custCredentialType;
    }

    public void setCustCredentialType(String custCredentialType) {
        this.custCredentialType = custCredentialType;
    }

    public String getCustCredentialNo() {
        return custCredentialNo;
    }

    public void setCustCredentialNo(String custCredentialNo) {
        this.custCredentialNo = custCredentialNo;
    }

    public String getUserCls() {
        return userCls;
    }

    public void setUserCls(String userCls) {
        this.userCls = userCls;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OpenAccountRequest{");
        sb.append("userCls='").append(userCls).append('\'');
        sb.append(", custId='").append(custId).append('\'');
        sb.append(", custName='").append(custName).append('\'');
        sb.append(", custCredentialType='").append(custCredentialType).append('\'');
        sb.append(", custCredentialNo='").append(custCredentialNo).append('\'');
        sb.append(", merchantNo='").append(merchantNo).append('\'');
        sb.append(", merchantName='").append(merchantName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

