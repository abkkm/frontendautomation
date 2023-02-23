package com.example.webApp1.DAO;

import com.example.webApp1.Entity.SalesEntity;
import com.example.webApp1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SalesDao  {
    public List<SalesEntity> getAllSalesEntity(){
        return HibernateUtil.getSessionFactory().openSession().createQuery("From SalesEntity",SalesEntity.class).getResultList();
    }

    public SalesEntity getSaleById(int id){
        return HibernateUtil.getSessionFactory().openSession().get(SalesEntity.class,id);
    }

    public void save(SalesEntity SalesEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(SalesEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public void update(SalesEntity SalesEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(SalesEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public void delete(SalesEntity SalesEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(SalesEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }
}
