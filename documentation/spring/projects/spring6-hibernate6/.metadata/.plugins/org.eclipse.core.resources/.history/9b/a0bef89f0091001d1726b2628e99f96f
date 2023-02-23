package com.example.webApp1.DAO;

import com.example.webApp1.Entity.DeliveriesEntity;
import com.example.webApp1.Entity.ProductsEntity;
import com.example.webApp1.Entity.SuppliersEntity;
import com.example.webApp1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DeliveriesDao {
        public List getAllDelivers(){
            return HibernateUtil.getSessionFactory().openSession().createQuery("From DeliveriesEntity").getResultList();
        }

        public void save(DeliveriesEntity DeliveriesEntity){
            try{
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                session.save(DeliveriesEntity);
                transaction.commit();
                session.close();
            }
            catch (Exception e){
                System.out.println("Exception:"+e);
            }
        }

        public void update(DeliveriesEntity DeliveriesEntity){
            try{
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                session.update(DeliveriesEntity);
                transaction.commit();
                session.close();
            }
            catch (Exception e){
                System.out.println("Exception:"+e);
            }
        }

        public void delete(DeliveriesEntity DeliveriesEntity){
            try{
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                session.delete(DeliveriesEntity);
                transaction.commit();
                session.close();
            }
            catch (Exception e){
                System.out.println("Exception:"+e);
            }
        }

        public DeliveriesEntity getDeliveryById(int id){
            Session session = HibernateUtil.getSessionFactory().openSession();
            DeliveriesEntity deliveriesEntity = session.get(DeliveriesEntity.class, id);
            session.close();
            return deliveriesEntity;
        }

        public List<DeliveriesEntity> getDeliveriesByProduct(ProductsEntity product){
            Session session = HibernateUtil.getSessionFactory().openSession();
            int id=product.getId();
            List<DeliveriesEntity> deliveries = session.createQuery("from DeliveriesEntity D where D.product.id="+id).getResultList();
            System.out.println(deliveries);
            session.close();
            return deliveries;
        }

    public List<DeliveriesEntity> getDeliveriesBySupplier(SuppliersEntity supplier) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int id = supplier.getId();
        List<DeliveriesEntity> deliveries = session.createQuery("from DeliveriesEntity D where D.idSupplier="+id).getResultList();
        session.close();
        return deliveries;
    }
}
