package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello2")
public class FirstAnotherServlet extends HttpServlet {

    private static final long serialVersionUID = 4383965599350483058L;


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init()-2 method is called");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service()-2 method is called");
    }
}
