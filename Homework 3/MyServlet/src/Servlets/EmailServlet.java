package Servlets;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyEditor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import static java.lang.System.out;

public class EmailServlet extends HttpServlet {

    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String to = request.getParameter("email");
        String from = "test@test.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);

        Session session = Session.getDefaultInstance(properties);
        PrintWriter printWriter = response.getWriter();

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(request.getParameter("subject"));
            message.setText(request.getParameter("text"));

            Transport.send(message);
            out.println("<h1> Message successfully sent");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
