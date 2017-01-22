package com.mytatis.test;

import com.mytatis.dto.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by zhangyuanyuan031 on 2017/1/22.
 */
public class OrderTest {
    private static final Logger logger= LoggerFactory.getLogger(OrderTest.class);

    private static SqlSessionFactory sf;

    @BeforeClass
    public static void initSF() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sf =  new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void testBindVal() throws Exception{

    }

    @Test
    public void testUpdateUser() throws Exception{
        SqlSession session=sf.openSession();
        UserEntity user = new UserEntity();
        user.setId("lisis");
        user.setUserName("lisisi");
        user.setCardId("");
        user.setEmail("lisisi@163.com");
        user.setCreateDate(new Date());
        user.setPwd("1234567");
        session.insert("com.user.UserEntity.updateSomeColumns", user);
        session.commit();
    }

    @Test
    public void testInsertUser() throws Exception{
        SqlSession session=sf.openSession();
        UserEntity user = new UserEntity();
        user.setUserName("yuan");
        user.setCardId("1234");
        user.setEmail("1234@163.com");
        user.setCreateDate(new Date());
        user.setPwd("123456");
        session.insert("com.user.UserEntity.uuidInsert", user);
        session.commit();
    }



}
