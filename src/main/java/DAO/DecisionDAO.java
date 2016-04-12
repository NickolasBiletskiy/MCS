package DAO;

import logic.Action;
import logic.Decision;
import logic.Specialist;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 07.03.2015.
 */
public class DecisionDAO implements GeneralDAO<Decision> {
    @Override
    public Decision getObjectByID(int id) throws SQLException {
        Session session = null;
        Decision decision = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            decision = (Decision)session.get(Decision.class, id);
            decision.setSpecialist((Specialist) session.get(Specialist.class, decision.getSpecialistId()));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка доступу", JOptionPane.OK_CANCEL_OPTION);
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return decision;
    }

    @Override
    public void addObject(Decision obj) throws SQLException {
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
