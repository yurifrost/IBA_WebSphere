package by.iba.student.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.iba.student.common.Student;

public class MainServlet extends HttpServlet {

    private static final long serialVersionUID = 6345194212526801506L;

    private final static List<Student> STUDENTS = new ArrayList<Student>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("lol", "lol");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/mainpage.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    }


}
