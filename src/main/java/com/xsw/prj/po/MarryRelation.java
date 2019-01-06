package com.xsw.prj.po;

import java.io.Serializable;

public class MarryRelation implements Serializable {
    private String huzhuguanxiId;

    private String guanxiName;

    private String memo;

    private static final long serialVersionUID = 1L;

    public String getHuzhuguanxiId() {
        return huzhuguanxiId;
    }

    public void setHuzhuguanxiId(String huzhuguanxiId) {
        this.huzhuguanxiId = huzhuguanxiId == null ? null : huzhuguanxiId.trim();
    }

    public String getGuanxiName() {
        return guanxiName;
    }

    public void setGuanxiName(String guanxiName) {
        this.guanxiName = guanxiName == null ? null : guanxiName.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}