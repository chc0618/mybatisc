package com.mybatis.chen.model;

import lombok.Data;

@Data
public class Person {

  private int id;
  private String name;
  private int age;
  private String phone;
  private String email;
  private String address;

  //set get toString
}

