package DAO;

import logic.Action;
import logic.Specialist;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 07.03.2015.
 */
public class ActionDAO implements GeneralDAO<Action> {
    @Override
    public Action getObjectByID(int id) throws SQLException {
        Session session = null;
        Action action = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            action = (Action)session.get(Action.class, id);
            action.setSpecialist((Specialist)session.get(Specialist.class,action.getSpecialistId()));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка доступу", JOptionPane.OK_CANCEL_OPTION);
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return action;
    }

    @Override
    public void addObject(Action obj) throws SQLException {

    }


}
