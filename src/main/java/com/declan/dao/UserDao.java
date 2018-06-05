package com.declan.dao;

import com.declan.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/6/5/005.
 */

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public String save(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        return "success";
    }
}
