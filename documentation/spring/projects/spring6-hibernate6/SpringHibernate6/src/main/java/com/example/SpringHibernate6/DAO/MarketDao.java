package com.example.SpringHibernate6.DAO;

import com.example.SpringHibernate6.Entity.MarketEntity;
import com.example.SpringHibernate6.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MarketDao {
    public List getAllProductsInMarketEntity(){
        return HibernateUtil.getSessionFactory().openSession().createQuery("From MarketEntity").list();
    }

    public void save(MarketEntity MarketEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(MarketEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public void update(MarketEntity MarketEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(MarketEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public void delete(MarketEntity MarketEntity){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(MarketEntity);
            transaction.commit();
            session.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    public MarketEntity getPositionById(int id){
        return HibernateUtil.getSessionFactory().openSession().get(MarketEntity.class,id);
    }
}
