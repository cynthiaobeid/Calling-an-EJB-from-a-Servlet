package com.example.firstentrepriseapp;

import AppSessionBean.FirstSessionBeanImplBean;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        super();
    }
    @EJB
    private FirstSessionBeanImplBean session;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(session.sayHello());
        out.println("</body></html>");
    }
}