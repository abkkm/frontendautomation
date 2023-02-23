package com.example.webApp1.DAO;

import com.example.webApp1.Entity.ProductsEntity;
import com.example.webApp1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDao
{
    public void save(ProductsEntity ProductsEntity) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.save(ProductsEntity);
            tx1.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Логин и почта уже существуют.");
        }
    }

    public void update(ProductsEntity ProductsEntity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(ProductsEntity);
        tx1.commit();
        session.close();
    }

    public void delete(ProductsEntity ProductsEntity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(ProductsEntity);
        tx1.commit();
        session.close();
    }

    public List<ProductsEntity> getListOfAllProductsEntitys(){
        return (List<ProductsEntity>) HibernateUtil.getSessionFactory().openSession().createQuery("From ProductsEntity",ProductsEntity.class).getResultList();
    }

    public ProductsEntity getProductsEntityById(int id){
        return HibernateUtil.getSessionFactory().openSession().get(ProductsEntity.class,id);
    }
}
