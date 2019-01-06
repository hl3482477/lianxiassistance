package com.xsw.prj.po;

import java.io.Serializable;

public class OrgFace implements Serializable {
    private String zhengzhimianmiaoId;

    private String zhengzhimianmiaoName;

    private static final long serialVersionUID = 1L;

    public String getZhengzhimianmiaoId() {
        return zhengzhimianmiaoId;
    }

    public void setZhengzhimianmiaoId(String zhengzhimianmiaoId) {
        this.zhengzhimianmiaoId = zhengzhimianmiaoId == null ? null : zhengzhimianmiaoId.trim();
    }

    public String getZhengzhimianmiaoName() {
        return zhengzhimianmiaoName;
    }

    public void setZhengzhimianmiaoName(String zhengzhimianmiaoName) {
        this.zhengzhimianmiaoName = zhengzhimianmiaoName == null ? null : zhengzhimianmiaoName.trim();
    }
}