package com.bao.dao;

import com.bao.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUser();
    User queryUserByName(@Param("username") String username);
}
