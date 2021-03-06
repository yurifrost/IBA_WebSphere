package by.iba.student.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.iba.student.common.model.Group;
//import by.iba.student.common.model.StudentForTest;

public class MainServlet extends HttpServlet {

    private static final long serialVersionUID = 6345194212526801506L;

   // private final static List<StudentForTest> STUDENTS = new ArrayList<StudentForTest>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Group g1 = new Group(1.2);
        req.setAttribute("lol", "lol");
        req.setAttribute("by/iba/student/common/group", g1);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/mainpage.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    }


}
