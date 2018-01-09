package com.avvarus.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter(filterName = "FirstFilter",
          urlPatterns = {"/SecondServlet"},
          initParams = {@WebInitParam(name = "Key1", value = "Value1"),
                    @WebInitParam(name = "Key2", value = "Value2")})
public class FirstFilter implements Filter {

    private FilterConfig config = null;

    public void destroy() {
        System.out.println("Filter Destroyed !!");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);

        Enumeration<String> paramEnumeration = config.getInitParameterNames();
        StringBuffer buffer = new StringBuffer();
        while (paramEnumeration.hasMoreElements()) {
            String paramName = paramEnumeration.nextElement();
            //System.out.println(paramName);
            String paramValue = config.getInitParameter(paramName);
            buffer.append(paramName + ":" + paramValue);
            buffer.append("<br/>");
        }
        resp.getWriter().println("Filter values " + buffer);


        System.out.println("Filter in do filter method !!");
    }

    public void init(FilterConfig config) throws ServletException {

        System.out.println("Filter initiated !!");
        this.config = config;
    }

}
