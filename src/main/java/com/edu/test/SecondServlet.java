package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    private static final long serialVersionUID = 5259474980942998287L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init() in Second Servlet method is called");
    }

//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        System.out.println("Service() in Second Servlet method is called");
//    }

    // service가 재정의 된 경우 호출되지 않음
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("doGet is called");

        PrintWriter out = res.getWriter();
        out.print("<html><head><title>Test</title></head>");
        out.print("<body><h1>have a nice day!!</h1></body>");
        out.print("</html>");
        out.close();
    }
}
