package com.xsw.prj.dao;

import com.xsw.prj.po.Account;

/**
 * @author 胡露
 * @date 2019/1/6
 * @time 13:00
 */

public interface DaoTemplate<T> {
    int deleteByPrimaryKey(Integer id) throws Exception;

    int insert(T record) throws Exception;

    int insertSelective(T record) throws Exception;

    T selectByPrimaryKey(Integer id) throws Exception;

    int updateByPrimaryKeySelective(T record) throws Exception;

    int updateByPrimaryKey(T record) throws Exception;
}
