package com.dao.impl;

import com.dao.LogDAO;
import com.model.Log;
import org.springframework.stereotype.Component;

@Component("logDAO")
public class LogDAOImpl extends SuperDAO implements LogDAO{

    @Override
    public void save(Log log) {
        this.getHibernateTemplate().save(log);
//        this.save(log);
        System.out.println("Log saved!!!");
    }

}
