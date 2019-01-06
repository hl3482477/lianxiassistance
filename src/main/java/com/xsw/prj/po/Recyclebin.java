package com.xsw.prj.po;

import java.io.Serializable;
import java.util.Date;

public class Recyclebin implements Serializable {
    private Integer id;

    private String recyclebinId;

    private String recyclebinName;

    private String recyclebinTable;

    private String recyclebinFieldKey;

    private String recyclebinFieldValue;

    private String memo;

    private String createDate;

    private String createUserId;

    private String createUserName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecyclebinId() {
        return recyclebinId;
    }

    public void setRecyclebinId(String recyclebinId) {
        this.recyclebinId = recyclebinId == null ? null : recyclebinId.trim();
    }

    public String getRecyclebinName() {
        return recyclebinName;
    }

    public void setRecyclebinName(String recyclebinName) {
        this.recyclebinName = recyclebinName == null ? null : recyclebinName.trim();
    }

    public String getRecyclebinTable() {
        return recyclebinTable;
    }

    public void setRecyclebinTable(String recyclebinTable) {
        this.recyclebinTable = recyclebinTable == null ? null : recyclebinTable.trim();
    }

    public String getRecyclebinFieldKey() {
        return recyclebinFieldKey;
    }

    public void setRecyclebinFieldKey(String recyclebinFieldKey) {
        this.recyclebinFieldKey = recyclebinFieldKey == null ? null : recyclebinFieldKey.trim();
    }

    public String getRecyclebinFieldValue() {
        return recyclebinFieldValue;
    }

    public void setRecyclebinFieldValue(String recyclebinFieldValue) {
        this.recyclebinFieldValue = recyclebinFieldValue == null ? null : recyclebinFieldValue.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }
}