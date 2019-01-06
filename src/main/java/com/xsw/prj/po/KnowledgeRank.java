package com.xsw.prj.po;

import java.io.Serializable;

public class KnowledgeRank implements Serializable {
    private String wenhuachengduId;

    private String wenhuachengduName;

    private static final long serialVersionUID = 1L;

    public String getWenhuachengduId() {
        return wenhuachengduId;
    }

    public void setWenhuachengduId(String wenhuachengduId) {
        this.wenhuachengduId = wenhuachengduId == null ? null : wenhuachengduId.trim();
    }

    public String getWenhuachengduName() {
        return wenhuachengduName;
    }

    public void setWenhuachengduName(String wenhuachengduName) {
        this.wenhuachengduName = wenhuachengduName == null ? null : wenhuachengduName.trim();
    }
}