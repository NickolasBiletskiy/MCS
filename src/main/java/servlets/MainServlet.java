package servlets;

/**
 * Created by vitaly on 22.03.2015.
 */

import DAO.Factory;
import logic.Action;
import logic.ConscriptCard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class MainServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ConscriptCard conscriptCard = null;
        Action action = null;
        try {
            conscriptCard = Factory.getInstance().getConscriptCardDAO().getObjectByID(1);
            action = Factory.getInstance().getActiontDAO().getObjectByID(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("name", conscriptCard.getName());
        req.setAttribute("action", action.getDate());

        req.getRequestDispatcher("mypage.jsp").forward(req, resp);
        req.getRequestDispatcher("error.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        super.doPost(req, resp);
    }

}
