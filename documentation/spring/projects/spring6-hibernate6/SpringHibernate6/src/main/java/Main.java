import com.example.SpringHibernate6.HibernateUtil;
import org.hibernate.query.Query;
import org.hibernate.Session;

import jakarta.persistence.Entity;
import jakarta.persistence.metamodel.EntityType;
import org.hibernate.metamodel.model.domain.JpaMetamodel;


public class Main {
	
    public static void main(final String[] args) throws Exception {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("querying all the managed entities...");
            final JpaMetamodel metamodel = (JpaMetamodel) session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query<?> query = session.createQuery("from " + entityName, Entity.class);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        }
        
    }
   

}