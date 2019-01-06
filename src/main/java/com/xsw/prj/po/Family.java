package com.xsw.prj.po;

import java.io.Serializable;
import java.util.Date;

public class Family implements Serializable {
    private Integer id;

    private String familyId;

    private String huzhuId;

    private String yikatong;

    private String dizhi;

    private Integer renkoushu;

    private Float renjunshouruNian;

    private String orgId;

    private String currFamilyType;

    private Integer baozhangRenkoushu;

    private String baozhangLeibie;

    private String baozhangZhanghao;

    private String baozhangYuanyin;

    private Float baozhangJingeYue;

    private Date kaishixiangshouRiqi;

    private Date pizhunRiqi;

    private Integer isdeleted;

    private Date createDate;

    private String createUserId;

    private String createUserName;

    private String modifyUserId;

    private String modifyUserName;

    private Date modidfyDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId == null ? null : familyId.trim();
    }

    public String getHuzhuId() {
        return huzhuId;
    }

    public void setHuzhuId(String huzhuId) {
        this.huzhuId = huzhuId == null ? null : huzhuId.trim();
    }

    public String getYikatong() {
        return yikatong;
    }

    public void setYikatong(String yikatong) {
        this.yikatong = yikatong == null ? null : yikatong.trim();
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }

    public Integer getRenkoushu() {
        return renkoushu;
    }

    public void setRenkoushu(Integer renkoushu) {
        this.renkoushu = renkoushu;
    }

    public Float getRenjunshouruNian() {
        return renjunshouruNian;
    }

    public void setRenjunshouruNian(Float renjunshouruNian) {
        this.renjunshouruNian = renjunshouruNian;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getCurrFamilyType() {
        return currFamilyType;
    }

    public void setCurrFamilyType(String currFamilyType) {
        this.currFamilyType = currFamilyType == null ? null : currFamilyType.trim();
    }

    public Integer getBaozhangRenkoushu() {
        return baozhangRenkoushu;
    }

    public void setBaozhangRenkoushu(Integer baozhangRenkoushu) {
        this.baozhangRenkoushu = baozhangRenkoushu;
    }

    public String getBaozhangLeibie() {
        return baozhangLeibie;
    }

    public void setBaozhangLeibie(String baozhangLeibie) {
        this.baozhangLeibie = baozhangLeibie == null ? null : baozhangLeibie.trim();
    }

    public String getBaozhangZhanghao() {
        return baozhangZhanghao;
    }

    public void setBaozhangZhanghao(String baozhangZhanghao) {
        this.baozhangZhanghao = baozhangZhanghao == null ? null : baozhangZhanghao.trim();
    }

    public String getBaozhangYuanyin() {
        return baozhangYuanyin;
    }

    public void setBaozhangYuanyin(String baozhangYuanyin) {
        this.baozhangYuanyin = baozhangYuanyin == null ? null : baozhangYuanyin.trim();
    }

    public Float getBaozhangJingeYue() {
        return baozhangJingeYue;
    }

    public void setBaozhangJingeYue(Float baozhangJingeYue) {
        this.baozhangJingeYue = baozhangJingeYue;
    }

    public Date getKaishixiangshouRiqi() {
        return kaishixiangshouRiqi;
    }

    public void setKaishixiangshouRiqi(Date kaishixiangshouRiqi) {
        this.kaishixiangshouRiqi = kaishixiangshouRiqi;
    }

    public Date getPizhunRiqi() {
        return pizhunRiqi;
    }

    public void setPizhunRiqi(Date pizhunRiqi) {
        this.pizhunRiqi = pizhunRiqi;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
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

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName == null ? null : modifyUserName.trim();
    }

    public Date getModidfyDate() {
        return modidfyDate;
    }

    public void setModidfyDate(Date modidfyDate) {
        this.modidfyDate = modidfyDate;
    }
}