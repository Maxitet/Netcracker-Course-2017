package HTTP_Sessions_and_Cookies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Scanner;

public class LoginServlet extends HttpServlet {

    public static final String DATABASE_PATH = "../webapps/ROOT/database.txt";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String inputLogin = request.getParameter("login");
        String inputPassword = request.getParameter("password");

        HttpSession session = request.getSession(true);
        String sessionLogin = (String) session.getAttribute("login");
        String sessionPassword = (String) session.getAttribute("password");

        if (!empty(inputLogin) && checkUser(inputLogin)) {
            if(!inputPassword.isEmpty() && checkPassword(inputPassword)) {
                session.setAttribute("login", inputLogin);
                session.setAttribute("password", inputPassword);
                response.sendRedirect("/WelcomePage?login=" + inputLogin);
                return;
            } else {
                session.invalidate();
                response.sendRedirect("/incorrect_password_httpsession.html");
                return;
            }
        }

        if (sessionLogin !=null && sessionPassword != null) {
            if(checkUser(sessionLogin)) {
                if(checkPassword(sessionPassword)) {
                    response.sendRedirect("/WelcomePage?login=" + sessionLogin);
                    return;
                }
            }
        }
        response.sendRedirect("/create_user.html");
    }

    static boolean empty(String str) {
        return str == null || str.trim().isEmpty();
    }

    static boolean checkUser(String checkLogin)
            throws FileNotFoundException {

        System.out.println(System.getProperty("user.dir"));
        Scanner scanner = new Scanner(new File(DATABASE_PATH));
        while (scanner.hasNextLine()) {
            String line[] = scanner.nextLine().split("#");
            if(line.length == 2) {
                String login = line[0];
                if (login.equals(checkLogin) ) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkPassword(String checkPassword)
            throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(DATABASE_PATH));
        while (scanner.hasNextLine()) {
            String line[] = scanner.nextLine().split("#");
            if(line.length == 2) {
                String password = line[1];
                if (password.equals(checkPassword) ) {
                    return true;
                }
            }
        }
        return false;
    }

}
