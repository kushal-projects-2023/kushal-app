package com.myapp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;

        PrintWriter out = response.getWriter();
        out.println("Sum: " + sum);
    }
}

