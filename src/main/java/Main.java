import DAO.Factory;
import logic.*;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by user on 02.03.2015.
 */
public class Main {

    public static void main(final String[] args) throws SQLException {
        System.out.println("Hello World");

        //Тест діставання службовця по id
        Specialist specialist = Factory.getInstance().getSpecialistDAO().getObjectByID(1);
        System.out.println(specialist.getName()+ " "  + specialist.getFathersName());

        //Тест діставання дії по id
        Action action = Factory.getInstance().getActiontDAO().getObjectByID(1);
        System.out.println(action.getDate()+ " "+ action.getPlaceItteract()+action.getTime());
        System.out.println(action.getSpecialist().getName());

        //Тест діставання рішення про призов
        Decision decision = Factory.getInstance().getDecisionDAO().getObjectByID(1);
        System.out.println(decision.getSpecialist().getSurName()+" "+decision.getComment());

        //Тест діставання рішення про призов
        ConscriptCard conscriptCard = Factory.getInstance().getConscriptCardDAO().getObjectByID(1);
        System.out.println(conscriptCard.getName()+ " " + conscriptCard.getSurName());

        //Тест запису нової картки
        ConscriptCard card = new ConscriptCard("Vasya","Ivanov","Petrovich","3910204140","lalalal","alslfdasj");
        Factory.getInstance().getConscriptCardDAO().addObject(card);

        //Тест документа
        //поміняти звязки з документами

        Document doc = Factory.getInstance().getDocumentDAO().getObjectByID(1);
        System.out.println(doc.getURL());
    }
}
