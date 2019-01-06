package com.xsw.prj.po;

import java.io.Serializable;
import java.util.Date;

public class Module implements Serializable {
    private Integer id;

    private String moduleId;

    private String parentId;

    private String moduleCode;

    private String moduleName;

    private String moduleTite;

    private String moduleImg;

    private String moduleType;

    private String navigateUrl;

    private Integer sortCode;

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

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleTite() {
        return moduleTite;
    }

    public void setModuleTite(String moduleTite) {
        this.moduleTite = moduleTite == null ? null : moduleTite.trim();
    }

    public String getModuleImg() {
        return moduleImg;
    }

    public void setModuleImg(String moduleImg) {
        this.moduleImg = moduleImg == null ? null : moduleImg.trim();
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public String getNavigateUrl() {
        return navigateUrl;
    }

    public void setNavigateUrl(String navigateUrl) {
        this.navigateUrl = navigateUrl == null ? null : navigateUrl.trim();
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
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