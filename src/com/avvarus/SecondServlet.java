package com.avvarus;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "SecondServlet",
          urlPatterns = {"/SecondServlet"},
          initParams = {@WebInitParam(name = "Seven", value = "Samurai"),
                    @WebInitParam(name = "Twelve", value = "Angry Men")}
)
public class SecondServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        service(request, response);

    }

    protected void service(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.getWriter().println(request.getServerPort() + " " + response.getStatus());
        } catch (IOException io) {
            System.out.println(io.getCause());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println("Welcome to Mars !!!" + getInitParameterNames());
        response.getWriter().println(request.getContextPath());
        response.getWriter().println(request.getHeaderNames().nextElement());
        response.getWriter().println(request.getServerPort());
        response.getWriter().println(request.getParameter("typeEmp"));

        ServletConfig cfg = getServletConfig();
        Enumeration<String> paramEnumeration = cfg.getInitParameterNames();
        StringBuffer buffer = new StringBuffer();
        while (paramEnumeration.hasMoreElements()) {
            String paramName = paramEnumeration.nextElement();
            String paramValue = cfg.getInitParameter(paramName);
            buffer.append(paramName + ":" + paramValue);
            buffer.append("<br/>");
        }
        response.getWriter().println(buffer);

        HttpSession session = request.getSession();
        session.setAttribute("Name", "Hyderabad");
        session.setMaxInactiveInterval(600);
        session.getCreationTime();

        response.getWriter().println(session.getAttribute("Name"));
        // request.getServerPort();
    }
}
