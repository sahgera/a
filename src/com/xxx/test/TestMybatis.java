package com.xxx.test;


import com.xxx.dao.UserMapper;
import com.xxx.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
@Test
    public void test(){
    // 1.创建sqlSessionFactoryBuilder对象
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    // 2.用流加载类路径下sqlConfig.xml文件,使用其中配置产生会话工厂sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(
            TestMybatis.class.getResourceAsStream("/sqlMapConfig.xml"));
    // 3.创建sqlSession对象,功用类似connection
    SqlSession sqlSession = sqlSessionFactory.openSession();
    // 4.使用sqlSession的getMapper()方法生成接口的代理实现类对象
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    System.out.println("userMapper = " + userMapper);
    // 5.使用实现类对象执行数据库操作
    List<User> allUsers = userMapper.findAllUsers();
    System.out.println("allUsers = " + allUsers);
    for (User user : allUsers) {
        System.out.println("user = " + user);
    }

}
    
}
