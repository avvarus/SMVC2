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
          initParams = {@WebInitParam(name = "Sujeeth", value = "Avvaru"),
                    @WebInitParam(name = "Sushma", value = "Nalla")}
)
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

        response.getWriter().println(session.getAttribute("Name"));
    }
}
