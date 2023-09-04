package com.tms.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/*")
public class FrontController extends HttpServlet {
    private PersonController personController = new PersonController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. Вытянуть путь
        //2. Выбрать нужный контроллер
        String jspPage =  dispatcher(req,resp,"GET");
        getServletContext().getRequestDispatcher("/jspPage").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String jspPage =  dispatcher(req,resp,"POST");
       getServletContext().getRequestDispatcher(jspPage).forward(req,resp);
        //2. Выбрать нужный контроллер
    }

    private String dispatcher(HttpServletRequest request, HttpServletResponse response, String httpMethod) {
        String httpPath = request.getRequestURI();
        if ("GET".equals(httpMethod)) {
            return switch (httpPath) {
                case "/user" -> personController.getAll(request);
                case "/user-by-id" -> personController.getById(request);
                default -> "/";
            };
        }
        if ("POST".equals(httpMethod)) {
            return switch (httpPath) {
                case "/user-delete" -> personController.deleteUser(request);
                case "/user-update" -> personController.updateUser(request);
                case "/user-create" -> personController.createUser(request);
                default -> "/";
            };
        }
        return "/";
    }
}
