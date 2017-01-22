package com.mytatis.test;

import com.mytatis.dto.CustomerEntity;
import com.mytatis.dto.OrdersEntity;
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
import java.util.List;

/**
 * Created by zhangyuanyuan031 on 2017/1/20.
 */
public class CustomerTest {
    private static final Logger logger= LoggerFactory.getLogger(CustomerTest.class);

    private static SqlSessionFactory sf;

    @BeforeClass
    public static void initSF() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sf =  new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testSelectOrderAll() throws Exception{
        SqlSession sqlSession = sf.openSession();
        List<OrdersEntity> list = sqlSession.selectList("com.order.queryAllOrder");
        System.out.println(list);
    }

    @Test
    public void testInsertOrder() throws Exception{
        SqlSession sqlSession = sf.openSession();
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setId(123);
        ordersEntity.setNo("abc1343lk");
        ordersEntity.setPrice(12.43f);
        sqlSession.insert("com.order.insert",ordersEntity);
        sqlSession.commit();
    }

    @Test
    public void testDel() throws Exception{
        SqlSession sqlSession = sf.openSession();
        sqlSession.delete("com.mytatis.dto.CustomerEntity.delete",10);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws Exception{
        SqlSession sqlSession = sf.openSession();
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(1);
        customerEntity.setName("黄小明");
        customerEntity.setAge(48);
        sqlSession.update("com.mytatis.dto.CustomerEntity.updata",customerEntity);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQuerybyId() throws Exception{
        SqlSession sqlSession = sf.openSession();
        CustomerEntity customerEntityList =sqlSession.selectOne("com.mytatis.dto.CustomerEntity.querybyId",10);
        System.out.println(customerEntityList);
    }

    @Test
    public void testselectAll() throws Exception{
        SqlSession sqlSession = sf.openSession();
       List<CustomerEntity> customerEntityList = sqlSession.selectList("com.mytatis.dto.CustomerEntity.queryAll");
        System.out.println(customerEntityList);
        sqlSession.close();
    }

    @Test
    public void testConnect() throws Exception{
        logger.info("开始插入数据");
        SqlSession session = sf.openSession();
        CustomerEntity customer = new CustomerEntity();
        customer.setId(11);
        customer.setName("xiaowang");
        customer.setAge(20);
        session.insert("com.mytatis.dto.CustomerEntity.insert",customer);
        session.commit();
        logger.info("插入成功");
    }

    @Test
    public void testDemo() throws Exception{
        logger.debug("弄个debug");
        System.out.println("hello word");
    }
}
