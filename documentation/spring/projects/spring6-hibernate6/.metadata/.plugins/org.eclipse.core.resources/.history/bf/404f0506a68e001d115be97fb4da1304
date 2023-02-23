package com.example.webApp1;

import com.example.webApp1.Entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{

    private static final SessionFactory sessionFactory=buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(CategoryEntity.class);
                configuration.addAnnotatedClass(CustomersEntity.class);
                configuration.addAnnotatedClass(DeliveriesEntity.class);
                configuration.addAnnotatedClass(MarketEntity.class);
                configuration.addAnnotatedClass(ProductsEntity.class);
                configuration.addAnnotatedClass(SalesEntity.class);
                configuration.addAnnotatedClass(SuppliersEntity.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                return configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Чистит кеш и закрывает соединение с БД
        getSessionFactory().close();
    }

}

