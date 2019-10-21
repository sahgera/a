package com.xxx.entity;

import java.sql.Date;

public class User {

    // 基本数据类型用包装类,,基础类型默认值为0包装类默认值是null,传入0可以识别
   private Integer id;
   private String username;
   private String password;
   private Date birthday;
   private String sex;
   private String address;

    public User(Integer id, String username, String password, Date birthday, String sex, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
