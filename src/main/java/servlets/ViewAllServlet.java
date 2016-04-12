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
import java.util.List;

/**
 * Created by vitaly on 03.04.2015.
 */
@WebServlet(name = "ViewAllServlet")
public class ViewAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response)

            throws ServletException, IOException {

        List<ConscriptCard> cards = null;
        try {
            cards= Factory.getInstance().getConscriptCardDAO().getAllCards();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        request.setAttribute("allcards", cards);

                request.getRequestDispatcher("/view_page.jsp").forward(request,

                        response);

    }
}
