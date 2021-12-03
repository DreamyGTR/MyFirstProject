package com.example.demo.util;

import org.apache.catalina.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DateBaseUtil {
    public static SqlSession getSqlSession() throws IOException {
        //读取mybatis配置文件
        Reader reader= Resources.getResourceAsReader("databaseConfig.xml");
        //类加载器加在配置文件
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        //执行配置文件中的sql语句
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
}
