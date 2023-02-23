package com.example.webApp1;

import org.hibernate.Metamodel;
import org.hibernate.Session;

import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;

public class Db {

    public static List<String> getAllTableNames() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<String> tableNames = new ArrayList<String>();
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                tableNames.add(entityType.getName());
            }
            return tableNames;
        }
    }
}
