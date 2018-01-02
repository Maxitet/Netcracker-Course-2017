package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    private static final String password = "password";

    public void init() throws ServletException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String login, userPassword;

        response.setContentType("text/html");

        login = request.getParameter("login");
        userPassword = request.getParameter("password");
        PrintWriter out = response.getWriter();

        if (userPassword.equals(password)) {
            out.println("<h1> Hello " + login + " </h1>");
        } else {
            out.println(("<h1> Incorrect password! <a href=\"login.html\">Try again?</a> </h1>"));
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
