package com.xsw.prj.po;

import java.io.Serializable;

public class BodyStatu implements Serializable {
    private String shentizhuangkuangId;

    private String shentizhuangkuangName;

    private static final long serialVersionUID = 1L;

    public String getShentizhuangkuangId() {
        return shentizhuangkuangId;
    }

    public void setShentizhuangkuangId(String shentizhuangkuangId) {
        this.shentizhuangkuangId = shentizhuangkuangId == null ? null : shentizhuangkuangId.trim();
    }

    public String getShentizhuangkuangName() {
        return shentizhuangkuangName;
    }

    public void setShentizhuangkuangName(String shentizhuangkuangName) {
        this.shentizhuangkuangName = shentizhuangkuangName == null ? null : shentizhuangkuangName.trim();
    }
}