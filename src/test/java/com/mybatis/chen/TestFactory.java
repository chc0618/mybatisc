package com.mybatis.chen;

import com.mybatis.chen.dao.PersonDao;
import com.mybatis.chen.model.Person;
import com.mybatis.chen.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestFactory {
  @Test
  public void test(){
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    PersonDao personDao =  sqlSession.getMapper(PersonDao.class);
    Person p = new Person();
    p.setAddress("广东省");
    p.setAge(12);
    p.setEmail("157538651@qq.com");
    p.setName("chen");
    p.setPhone("15345634565");
    personDao.insert(p);
    System.out.println(p.toString());
    sqlSession.commit();
    sqlSession.close();
  }
}
