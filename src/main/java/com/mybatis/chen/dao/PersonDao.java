package com.mybatis.chen.dao;

import com.mybatis.chen.model.Person;
import org.apache.ibatis.annotations.Select;

public interface PersonDao {
  int insert(Person p);

  @Select("select * from person where id = #{id}")
  Person select(Long id);
}
