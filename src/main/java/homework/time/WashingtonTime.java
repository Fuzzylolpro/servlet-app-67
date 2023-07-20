package homework.time;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/washington")
public class WashingtonTime extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime washingtonDateTime = now.minusHours(7);
        PrintWriter writer = resp.getWriter();
        writer.println(washingtonDateTime);
        writer.close();

    }
}
