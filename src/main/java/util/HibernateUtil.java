package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by user on 06.03.2015.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
        static {
            try{
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex){
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError();
            }
        }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
