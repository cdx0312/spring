package com.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SuperDAO extends HibernateDaoSupport{
    @Resource(name = "sessionFactory")
    public void setSuperSessionFactory(SessionFactory superSessionFactory){
        super.setSessionFactory(superSessionFactory);
    }
}
