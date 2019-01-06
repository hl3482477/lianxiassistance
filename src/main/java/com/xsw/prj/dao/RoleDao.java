package com.xsw.prj.dao;

import com.xsw.prj.po.Role;

import java.util.List;
import java.util.Map;

public interface RoleDao  extends DaoTemplate<Role>{


    List<Role> getAllByPage(Map<String, Object> condition);

    int getCount(Map<String, Object> condition);
}