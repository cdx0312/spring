package com.registration.dao.impl;

import com.registration.dao.UserDao;
import com.registration.model.User;
import com.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component("userDao")
public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(User user) {
        hibernateTemplate.save(user);
    }

    @Override
    public boolean checkUserExistsWithName(String username) {
        List<User> users = (List<User>)hibernateTemplate.find("from User user where user.username = '" + username + "'");

       return (users != null) && (users.size()>0);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>)this.hibernateTemplate.find("from User");
    }

    @Override
    public User loadById(int id) {
        return (User)this.hibernateTemplate.load(User.class, id);
    }


}
