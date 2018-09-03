package com.registration.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            // 出现异常需要销毁StandardServiceRegistry注册表
            StandardServiceRegistryBuilder.destroy(registry);
            System.out.println("创建会化工厂失败");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
