package com.registration.service;

import com.registration.model.User;
import com.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.sql.*;

public class UserManager {


    public boolean exists(User user)throws Exception{
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        long count = (Long)session.createQuery("select count(*) from User u where u.username = :username")
                .setString("username", user.getUsername())
                .uniqueResult();
        session.getTransaction().commit();
        return count > 0;
    }

    public void add(User user) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
