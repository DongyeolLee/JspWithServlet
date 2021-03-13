package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {

    private static final long serialVersionUID = 217591873984198118L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=EUC-KR");

        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<head><title>요청 방식과 프로토콜 정보</title></head>");
        out.print("<body>");
        out.print("<h3>네트워크 관련 요청 정보</h3>");
        out.print("Request URI : " + req.getRequestURI() + "<br/>");
        out.print("Request URL : " + req.getRequestURL() + "<br/>");
        out.print("Context Path : " + req.getContextPath() + "<br/>");
        out.print("Request Protocol : " + req.getProtocol() + "<br/>");
        out.print("Servelt Path : " + req.getServletPath() + "<br/>");
        out.print("</body>");
        out.print("</html>");
    }
}
