package com.dao;

import com.pogo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserLike(String value);

    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //插入用户
    void addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

    int addUser2(Map<String, Object> map);

    User getUserById2(Map<String, Object> map);
}
