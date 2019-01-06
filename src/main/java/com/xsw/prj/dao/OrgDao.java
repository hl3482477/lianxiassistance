package com.xsw.prj.dao;

import com.xsw.prj.po.Org;
import com.xsw.prj.po.Recyclebin;

import java.util.List;
import java.util.Map;

public interface OrgDao  extends DaoTemplate<Org>{

    List<Org> getAllByPage(Map<String, Object> condition);

    int getCount(Map<String, Object> condition);
}