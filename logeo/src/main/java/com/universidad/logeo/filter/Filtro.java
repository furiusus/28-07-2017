package com.universidad.logeo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by rony on 09/07/17.
 */
@WebFilter(urlPatterns = "/*")
public class Filtro implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        res.addHeader("X-XSS-Protection", "1; mode=block");
        res.addHeader("X-Content-Type-Options", "nosniff");
        res.addHeader("X-Frame-Options", "SAMEORIGIN");
        res.addHeader("Server", "Servidor web");
        /**
         * Activar para obtener la URL
         */
        //System.out.println(req.getRequestURL().toString());
        if(req.getRequestURL().toString().contains(".js")){
            res.setContentType("text/javascript");
        }
        else if(req.getRequestURL().toString().contains(".css")){
            res.setContentType("text/css");
        }

        filterChain.doFilter(req, res);
    }

    public void destroy() {

    }
}
