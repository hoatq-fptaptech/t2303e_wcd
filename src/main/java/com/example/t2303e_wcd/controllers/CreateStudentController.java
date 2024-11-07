package com.example.t2303e_wcd.controllers;

import com.example.t2303e_wcd.dao.StudentDAO;
import com.example.t2303e_wcd.entity.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/create-student")
public class CreateStudentController extends HttpServlet {
    private StudentDAO _studentDAO;

    @Override
    public void init() throws ServletException {
        _studentDAO = new StudentDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("student/create.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student s = new Student(
                null,
                req.getParameter("name"),
                req.getParameter("email"),
                req.getParameter("address"),
                req.getParameter("telephone")
        );
        if(_studentDAO.create(s)){
            resp.sendRedirect("student");
            return;
        }
        resp.sendRedirect("create-student");
    }
}
