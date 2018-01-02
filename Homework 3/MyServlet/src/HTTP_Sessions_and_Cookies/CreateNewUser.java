package HTTP_Sessions_and_Cookies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println(login);
        System.out.println(password);

        try (FileWriter fileWriter = new FileWriter("../webapps/ROOT/database.txt", true)) {
            fileWriter.write(login + "#" + password + "\n");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Запись завершена");
        response.sendRedirect("/login2.html");
    }
}
