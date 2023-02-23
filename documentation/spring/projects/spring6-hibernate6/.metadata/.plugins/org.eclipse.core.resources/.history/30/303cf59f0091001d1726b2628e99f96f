package com.example.webApp1.DAO;

import com.example.webApp1.Entity.CustomersEntity;
import com.example.webApp1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao
{
    public void save(CustomersEntity CustomersEntity) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.save(CustomersEntity);
            tx1.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Логин и почта уже существуют.");
        }
    }

    public void update(CustomersEntity CustomersEntity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(CustomersEntity);
        tx1.commit();
        session.close();
    }

    public void delete(CustomersEntity CustomersEntity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(CustomersEntity);
        tx1.commit();
        session.close();
    }

    public List getListOfAllCustomersEntities(){
        return HibernateUtil.getSessionFactory().openSession().createQuery("From CustomersEntity",CustomersEntity.class).getResultList();
    }

    public CustomersEntity getCustomersEntityById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        CustomersEntity customersEntity = session.get(CustomersEntity.class,id);
        session.close();
        return customersEntity;
    }
}
