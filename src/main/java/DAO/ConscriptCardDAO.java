package DAO;

import logic.ConscriptCard;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 20.03.2015.
 */
public class ConscriptCardDAO implements GeneralDAO<ConscriptCard> {
    @Override
    public ConscriptCard getObjectByID(int id) throws SQLException {
        Session session = null;
        ConscriptCard conscriptCard = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            conscriptCard = (ConscriptCard)session.get(ConscriptCard.class, id);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка доступу", JOptionPane.OK_CANCEL_OPTION);
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return conscriptCard;
    }

    @Override
    public void addObject(ConscriptCard obj) throws SQLException {
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

    public List<ConscriptCard> getAllCards() throws SQLException {
        Session session = null;
        List cards = new ArrayList<ConscriptCard>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            cards = session.createCriteria(ConscriptCard.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        Collections.sort(cards, new Comparator<ConscriptCard>() {
            @Override
            public int compare(ConscriptCard o1, ConscriptCard o2) {
                return o1.getSurName().compareTo(o2.getSurName());
            }
        });
        return cards;
    }
}
