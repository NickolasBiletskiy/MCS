package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContServlet

        extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response)

            throws ServletException, IOException {

//добавление атрибута к запросу

        request.setAttribute("loc", "hello");

//добавление атрибута к сессии



//получение объекта RequestDispatcher и вызов JSP

        request.getRequestDispatcher("/test_main.jsp").forward(request,

                response);

    }

}
