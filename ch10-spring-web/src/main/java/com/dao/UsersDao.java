package com.dao;

import com.entity.Users;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/3
 * Time: 17:05
 */
public interface UsersDao {
    int insertUsers(Users user);

    List<Users> selectUsers();
}
