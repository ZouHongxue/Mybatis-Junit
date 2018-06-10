package com.zhx.test;

import com.zhx.dao.UserOperation;
import com.zhx.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestUserOperation {

    SqlSession sqlSession;
    UserOperation userOperation;
    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sessionFactory.openSession();
        userOperation = sqlSession.getMapper(UserOperation.class);
    }

    @Ignore
    public void selectUserById(){
        User user = userOperation.selectUserById(1);
        System.out.println(user.getUserName());
    }

    @Ignore
    public void selectAllUser(){
        for (User user : userOperation.selectUsers()) {
            System.out.println(user.getUserName());
        }
    }

    @Test
    public void addUser(){
        User user = new User(){{
            this.setUserName("winter");
            this.setUserAge("10");
            this.setUserAddress("heaven");
        }};
        userOperation.addUser(user);
        sqlSession.commit();
        System.out.println(user.getId());
    }
}
