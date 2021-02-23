package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet {

    private static final long serialVersionUID = -4565570147942702873L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init() method is called");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service() method is called");
    }
}
