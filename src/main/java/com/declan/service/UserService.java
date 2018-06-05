package com.declan.service;

import com.declan.dao.UserDao;
import com.declan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.UserDataHandler;

/**
 * Created by Administrator on 2018/6/5/005.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String save(User user) {
        return userDao.save(user);
    }
}
