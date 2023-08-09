package com.tms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("firstname");
        String name1 = req.getParameter("lastname");

        req.setAttribute("nameKey", name);
        getServletContext().getRequestDispatcher("/").forward(req, resp);
        //как вызывать страницы(html, jsp, ftl)

    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet start ....");

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("Servlet work ...");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroy ....");
    }
}
