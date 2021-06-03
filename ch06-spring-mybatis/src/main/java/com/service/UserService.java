package com.service;

import com.entity.Users;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/3
 * Time: 18:42
 */
public interface UserService {

    int addUsers(Users user);

    List<Users> queryUsers();
}
