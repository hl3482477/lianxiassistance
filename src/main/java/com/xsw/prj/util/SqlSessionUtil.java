package com.xsw.prj.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 

public class SqlSessionUtil {
	public static SqlSession getSqlSession() throws IOException {

        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        return sqlSessionFactory.openSession();

    }
 
}
