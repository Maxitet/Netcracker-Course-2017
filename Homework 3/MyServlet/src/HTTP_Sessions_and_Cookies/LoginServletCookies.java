package HTTP_Sessions_and_Cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static HTTP_Sessions_and_Cookies.LoginServlet.*;

public class LoginServletCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String inputLogin = request.getParameter("login");
        String inputPassword = request.getParameter("password");
        String rememberUser =  request.getParameter("remember_user");
        Cookie[] cookies = request.getCookies();


        //Проверяем имеющиеся куки
        if(cookies != null) {
            String cookieLogin = null;
            String cookiePassword = null;
            for(Cookie cookie : cookies) {
                if (cookie.getName().equals("login")) {
                    cookieLogin = cookie.getValue();
                }

                if (cookie.getName().equals("password")) {
                    cookiePassword = cookie.getValue();
                }
            }
            if(checkUser(cookieLogin) && checkPassword(cookiePassword)) {
                response.sendRedirect("/WelcomePage?login=" + cookieLogin);
                return;
            }
        }

        //Проверяем введённое пользователем
        if (!empty(inputLogin) && checkUser(inputLogin)) {
            if(!empty(inputPassword) && checkPassword(inputPassword)) {
                //Записываем новые куки
                if(rememberUser != null && rememberUser.equals("on")) {
                    Cookie login = new Cookie("login", inputLogin);
                    Cookie password = new Cookie("password", inputPassword);
                    login.setMaxAge(60 * 60 * 24);
                    password.setMaxAge(60 * 60 * 24);
                    response.addCookie(login);
                    response.addCookie(password);
                }
                response.sendRedirect("/WelcomePage?login=" + inputLogin);
                return;

            } else {
                if(cookies != null) { // Чистим куки
                    for (Cookie cookie : cookies) {
                        cookie.setMaxAge(0);
                        response.addCookie(cookie);
                    }
                }
                response.sendRedirect("/incorrect_password_cookies.html");
                return;
            }
        }
        response.sendRedirect("/create_user.html");
    }
}
