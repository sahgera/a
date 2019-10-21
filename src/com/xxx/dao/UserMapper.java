package com.xxx.dao;

import com.xxx.entity.User;

import java.util.List;

/**
 * DAO层访问数据库
 */
public interface UserMapper {

    // 查询用户表所有数据,使用抽象方法
    List<User> findAllUsers();


}
