package servlets;

import DAO.Factory;
import logic.ConscriptCard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by vitaly on 03.04.2015.
 */
@WebServlet(name = "CreateServlet")
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response)

            throws ServletException, IOException {


//добавление атрибута к запросу

        String surname = request.getParameter("surname");
        String name = request.getParameter("name");
        String fathers_name = request.getParameter("fathersname");
        String phone_number = request.getParameter("phonenumber");
        String passportdata = request.getParameter("passportdata");
        String medicalID = request.getParameter("medicalID");
        ConscriptCard card = new ConscriptCard(name,surname,fathers_name,phone_number,passportdata,medicalID);
        try {
            Factory.getInstance().getConscriptCardDAO().addObject(card);
        } catch (SQLException e) {
            e.printStackTrace();
        }


//добавление атрибута к сессии



//получение объекта RequestDispatcher и вызов JSP

        request.getRequestDispatcher("/view_page.jsp").forward(request,

                response);

    }
}
