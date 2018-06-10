package com.zhx.dao;

import com.zhx.pojo.User;

import java.util.List;

public interface UserOperation {
    User selectUserById(int id);
    List<User> selectUsers();
    void addUser(User user);
}
