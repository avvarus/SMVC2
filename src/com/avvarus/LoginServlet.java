package com.avvarus;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
          name = "LoginServlet",
          urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //System.out.println("Post method of Welcome Servlet");

        response.getWriter().println("Hey !!!");
        response.getWriter().println("Hey !!!" + request.getParameterNames().nextElement());
        response.getWriter().println("Hey !!!" + request.getServerName());
        response.getWriter().println(request.getParameter("uname") + " -- " + request.getParameter("pass"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {

        System.out.println("Get method of Welcome Servlet");
        response.getWriter().println("Hey !!!");
    }
}
