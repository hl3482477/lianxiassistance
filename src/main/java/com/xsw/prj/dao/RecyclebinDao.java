package com.xsw.prj.dao;

import com.xsw.prj.po.Recyclebin;

import java.util.List;
import java.util.Map;

public interface RecyclebinDao  extends DaoTemplate<Recyclebin>{


    List<Recyclebin> getAllByPage(Map<String, Object> condition);

    int getCount(Map<String, Object> condition);
}