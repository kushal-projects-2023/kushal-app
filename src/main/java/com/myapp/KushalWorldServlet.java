package com.myapp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class KushalWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Kushal World!");
    }
}

