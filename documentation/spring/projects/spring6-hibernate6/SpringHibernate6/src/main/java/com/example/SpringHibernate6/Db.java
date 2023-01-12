package com.example.SpringHibernate6;

import org.hibernate.metamodel.model.domain.JpaMetamodel;
import org.hibernate.Session;

import jakarta.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;

public class Db {

    public static List<String> getAllTableNames() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<String> tableNames = new ArrayList<String>();
            final JpaMetamodel metamodel = (JpaMetamodel) session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                tableNames.add(entityType.getName());
            }
            return tableNames;
        }
    }
}
