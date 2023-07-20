package homework.time;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/beijing")
public class BeijingTime extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime washingtonDateTime = dateTime.plusHours(5);
        PrintWriter writer = resp.getWriter();
        writer.println(washingtonDateTime);
        writer.close();

    }
}