package com.xsw.prj.po;

import java.io.Serializable;

public class MarryStatu implements Serializable {
    private String hunyinzhuangkuangId;

    private String hunyinzhuangkuangName;

    private static final long serialVersionUID = 1L;

    public String getHunyinzhuangkuangId() {
        return hunyinzhuangkuangId;
    }

    public void setHunyinzhuangkuangId(String hunyinzhuangkuangId) {
        this.hunyinzhuangkuangId = hunyinzhuangkuangId == null ? null : hunyinzhuangkuangId.trim();
    }

    public String getHunyinzhuangkuangName() {
        return hunyinzhuangkuangName;
    }

    public void setHunyinzhuangkuangName(String hunyinzhuangkuangName) {
        this.hunyinzhuangkuangName = hunyinzhuangkuangName == null ? null : hunyinzhuangkuangName.trim();
    }
}