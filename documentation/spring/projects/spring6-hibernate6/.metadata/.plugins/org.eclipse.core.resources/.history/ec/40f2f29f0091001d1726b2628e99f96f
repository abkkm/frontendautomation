package com.example.webApp1.DAO;

import com.example.webApp1.Entity.CategoryEntity;
import com.example.webApp1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDao {
    public List<CategoryEntity> getAllCategories() {
        return HibernateUtil.getSessionFactory().openSession().createQuery("From CategoryEntity ", CategoryEntity .class).list();
    }

    public void save(CategoryEntity CategoryEntity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(CategoryEntity );
        tx1.commit();
        session.close();
    }

    public void update(CategoryEntity CategoryEntity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(CategoryEntity );
        transaction.commit();
        session.close();
    }

    public void delete(CategoryEntity CategoryEntity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(CategoryEntity);
        transaction.commit();
        session.close();
    }

    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CategoryEntity categoryEntity = session.get(CategoryEntity.class,id);
        Transaction transaction = session.beginTransaction();
        session.delete(categoryEntity);
        transaction.commit();
        session.close();
    }

    public CategoryEntity getCategoryEntityById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CategoryEntity categoryEntity = session.get(CategoryEntity.class, id);
        session.close();
        return categoryEntity;
    }

    public List getAllProducts() {
        return HibernateUtil.getSessionFactory().openSession().createQuery("From CategoryEntity ").list();
    }


}
