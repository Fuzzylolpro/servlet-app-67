package FormApplication;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save-request")
public class SaveRequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            response.sendRedirect("index.html");
        } else {
            String successMessage = "Заявка успешно сохранена:<br><br>" +
                    "Name: " + name + "<br>" +
                    "Email: " + email + "<br>" +
                    "Message: " + message;
            request.setAttribute("successMessage", successMessage);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
    }
}