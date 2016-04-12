package DAO;

import logic.Document;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;

/**
 * Created by user on 21.03.2015.
 */
public class DocumentDAO  implements GeneralDAO<Document> {

    @Override
    public Document getObjectByID(int id) throws SQLException {
        Session session = null;
        Document document = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            document = (Document) session.get(Document.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка доступу", JOptionPane.OK_CANCEL_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return document;
    }


    @Override
    public void addObject(Document obj) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(obj);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка при вставці", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }
}
