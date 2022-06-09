package com.cos.s2.services;

import com.cos.s2.entity.User;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/6 8:57
 * @description:
 */
public interface UserServices {
    List<User> getAll();

    User getUserById(int id);

    int addUser(User u);

    int updateUser(User u);

    int delUser(int id);
}
