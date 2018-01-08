package com.avvarus;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SecondServlet",
          urlPatterns = {"/SecondServlet"})
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println("Welcome to Mars !!!");
        response.getWriter().println(request.getContextPath());
        response.getWriter().println(request.getHeaderNames().nextElement());
        response.getWriter().println(request.getServerPort());
    }
}
