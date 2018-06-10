package com.zhx.test;

import com.zhx.dao.UserOperation;
import com.zhx.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        String mybatis = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(mybatis);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserOperation userOperation = sqlSession.getMapper(UserOperation.class);
        User user = userOperation.selectUserById(1);
//        User user = sqlSession.selectOne("com.zhx.userMapper.selectUser",1);
        sqlSession.close();
        System.out.println(user.getUserName());
    }
}
