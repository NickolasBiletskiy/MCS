package DAO;

import logic.Specialist;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 06.03.2015.
 */
public class SpecialistDAO implements GeneralDAO<Specialist> {
    @Override
    public Specialist getObjectByID(int id) throws SQLException{
        Session session = null;
        Specialist specialist = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            specialist = (Specialist)session.get(Specialist.class, id);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Помилка доступу", JOptionPane.OK_CANCEL_OPTION);
        } finally {
            if (session != null && session.isOpen()){
               session.close();
            }
        }
        return specialist;
    }

    @Override
    public void addObject(Specialist obj) throws SQLException {

    }


}
