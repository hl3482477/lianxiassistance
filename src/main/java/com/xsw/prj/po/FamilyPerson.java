package com.xsw.prj.po;

import java.io.Serializable;
import java.util.Date;

public class FamilyPerson implements Serializable {
    private Integer id;

    private String personId;

    private String familyId;

    private String personName;

    private String xingbie;

    private String sfz;

    private String phone;

    private String hujileixing;

    private String huzhuguanxiId;

    private String shentizhuangkuangId;

    private String wenhuachengduId;

    private String zhengzhimianmiaoId;

    private String hunyinzhuangkuangId;

    private String congyeqingkuang;

    private Integer isDibao;

    private Integer isShanyang;

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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId == null ? null : familyId.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz == null ? null : sfz.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHujileixing() {
        return hujileixing;
    }

    public void setHujileixing(String hujileixing) {
        this.hujileixing = hujileixing == null ? null : hujileixing.trim();
    }

    public String getHuzhuguanxiId() {
        return huzhuguanxiId;
    }

    public void setHuzhuguanxiId(String huzhuguanxiId) {
        this.huzhuguanxiId = huzhuguanxiId == null ? null : huzhuguanxiId.trim();
    }

    public String getShentizhuangkuangId() {
        return shentizhuangkuangId;
    }

    public void setShentizhuangkuangId(String shentizhuangkuangId) {
        this.shentizhuangkuangId = shentizhuangkuangId == null ? null : shentizhuangkuangId.trim();
    }

    public String getWenhuachengduId() {
        return wenhuachengduId;
    }

    public void setWenhuachengduId(String wenhuachengduId) {
        this.wenhuachengduId = wenhuachengduId == null ? null : wenhuachengduId.trim();
    }

    public String getZhengzhimianmiaoId() {
        return zhengzhimianmiaoId;
    }

    public void setZhengzhimianmiaoId(String zhengzhimianmiaoId) {
        this.zhengzhimianmiaoId = zhengzhimianmiaoId == null ? null : zhengzhimianmiaoId.trim();
    }

    public String getHunyinzhuangkuangId() {
        return hunyinzhuangkuangId;
    }

    public void setHunyinzhuangkuangId(String hunyinzhuangkuangId) {
        this.hunyinzhuangkuangId = hunyinzhuangkuangId == null ? null : hunyinzhuangkuangId.trim();
    }

    public String getCongyeqingkuang() {
        return congyeqingkuang;
    }

    public void setCongyeqingkuang(String congyeqingkuang) {
        this.congyeqingkuang = congyeqingkuang == null ? null : congyeqingkuang.trim();
    }

    public Integer getIsDibao() {
        return isDibao;
    }

    public void setIsDibao(Integer isDibao) {
        this.isDibao = isDibao;
    }

    public Integer getIsShanyang() {
        return isShanyang;
    }

    public void setIsShanyang(Integer isShanyang) {
        this.isShanyang = isShanyang;
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