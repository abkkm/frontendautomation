package com.example.SpringHibernate6.DAO;


import com.example.SpringHibernate6.Entity.SuppliersEntity;
import com.example.SpringHibernate6.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SuppliersDao {
    public List<SuppliersEntity> getAllSuppliersEntity(){
        return HibernateUtil.getSessionFactory().openSession().createQuery("From SuppliersEntity", SuppliersEntity.class).getResultList();
    }

    public void save(SuppliersEntity SuppliersEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(SuppliersEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public void update(SuppliersEntity SuppliersEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(SuppliersEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public void delete(SuppliersEntity SuppliersEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(SuppliersEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public SuppliersEntity getSupplierById(int id){
        return HibernateUtil.getSessionFactory().openSession().get(SuppliersEntity.class,id);
    }
}
