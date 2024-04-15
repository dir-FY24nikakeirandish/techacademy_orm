package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PERSISTANE_UNITT_NAME = "techacademy_orm";
    private static EntityManagerFactory emf;
        
    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
        
    }
        
    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTANE_UNITT_NAME);
        
    }
        return emf;
    }

}
