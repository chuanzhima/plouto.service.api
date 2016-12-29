package com.smk.pay.account.core.response;

import java.io.Serializable;
import java.util.List;

/**
 * Project plouto.service.api
 * Created by chuanzhi.macz
 * Date 2016/12/16 11:12
 */
public abstract class BasePageResp<T extends Serializable> implements Serializable {

    // 信息列表
    private List<T> infoList;
    // 每页记录数
    private int pageSize;
    // 总页数
    private int pageCount;
    // 总记录数
    private int count;

    public BasePageResp() {

    }

    public BasePageResp(List<T> infoList, int pageSize, int pageCount, int count) {
        this.infoList = infoList;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.count = count;
    }

    public List<T> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<T> infoList) {
        this.infoList = infoList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
