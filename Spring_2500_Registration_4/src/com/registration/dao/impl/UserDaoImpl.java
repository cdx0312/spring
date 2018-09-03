package com.registration.dao.impl;

import com.registration.dao.UserDao;
import com.registration.model.User;
import com.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    @Override
    public boolean checkUserExistsWithName(String username) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        long count = (Long)session.createQuery("select count(*) from User u where u.username = :username")
                .setString("username", username)
                .uniqueResult();
        session.getTransaction().commit();
        return count > 0;
    }
}
