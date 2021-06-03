package com.service.Impl;

import com.dao.UsersDao;
import com.entity.Users;
import com.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/3
 * Time: 18:45
 */
public class UserServiceImpl implements UserService {

    //引用类型dao
    private UsersDao usersDao;

    //使用set注入，赋值
    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public int addUsers(Users user) {
        int nums = usersDao.insertUsers(user);
        return nums;
    }

    @Override
    public List<Users> queryUsers() {
        return usersDao.selectUsers();
    }
}
