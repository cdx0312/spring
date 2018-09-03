package com.dao.impl;

import com.dao.LogDAO;
import com.dao.UserDAO;
import com.model.Log;
import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Component("logDAO")
public class LogDAOImpl implements LogDAO{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Log log) {
        Session session = sessionFactory.getCurrentSession();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
        session.save(log);
//        session.getTransaction().commit();
        System.out.println("Log saved!!!");
    }

}
