package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class InfoServlet extends HttpServlet {

    public void init() throws ServletException {

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String userAgent = request.getHeader("User-Agent");
        PrintWriter out = response.getWriter();
        //String date = response.getHeader("Date");
        Date date = new Date();

        out.println("<h3> Your User-Agent is: " + userAgent + "</br>");
        out.println("Current time is: " + date + "</h3>");
    }
}
