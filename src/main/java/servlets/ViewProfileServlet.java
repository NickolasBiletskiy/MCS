package servlets;

import DAO.Factory;
import logic.ConscriptCard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ViewProfileServlet

        extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response)

            throws ServletException, IOException {


        String id = request.getParameter("ID");

         ConscriptCard conscriptCard = null;
        try {
            conscriptCard = Factory.getInstance().getConscriptCardDAO().getObjectByID(Integer.parseInt(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }

//добавление атрибута к запросу

        request.setAttribute("id", conscriptCard.getId());
        request.setAttribute("name", conscriptCard.getName());
        request.setAttribute("fathersname", conscriptCard.getFathersName());
        request.setAttribute("surname", conscriptCard.getSurName());
        request.setAttribute("number", conscriptCard.getPhoneNumber());
        request.setAttribute("passport", conscriptCard.getPassportData());
        request.setAttribute("medical", conscriptCard.getMedicalCardId());



//добавление атрибута к сессии



//получение объекта RequestDispatcher и вызов JSP

        request.getRequestDispatcher("/view_profile.jsp").forward(request,

                response);

    }

}
