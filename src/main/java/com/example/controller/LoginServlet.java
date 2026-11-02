package com.example.controller;

import com.example.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    @Override
    public void init() {
        userDao = new UserDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Ambil data dari form HTML
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");

        // Validasi ke Database
        if (userDao.validate(uname, pass)) {
            response.sendRedirect("success.jsp"); // Benar -> masuk halaman sukses
        } else {
            response.sendRedirect("index.jsp?error=1"); // Salah -> balik login
        }
    }
}

