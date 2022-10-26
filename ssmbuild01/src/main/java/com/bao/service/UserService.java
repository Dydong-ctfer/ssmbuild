package com.bao.service;

import com.bao.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有用户
    List<User> queryAllUsers();
    //查询用户
    User queryUserByName(String username);
}
