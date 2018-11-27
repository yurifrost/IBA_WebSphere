package by.iba.student.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.iba.student.common.model.StudentForTest;

public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 6345194112526801506L;

    private final static List<StudentForTest> STUDENT_FOR_TESTS = new ArrayList<StudentForTest>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        STUDENT_FOR_TESTS.add(new StudentForTest("sdvs", "fwerf"));
        req.setAttribute("students", STUDENT_FOR_TESTS);
        req.setAttribute("hui", "hui");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/test.jsp");
        dispatcher.forward(req, resp);

        //String name = req.getParameter("name");
				/*resp.setContentType("text/html");

				PrintWriter pw = resp.getWriter();
				pw.print("<form>"ui);
				pw.print("<input type=\"text\" name=\"name\">");
				pw.print("<input type=\"submit\">");
				pw.print("</form>");
				//pw.print("Hello, " + name);
				pw.close();*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String secondName = req.getParameter("secondName");
        System.out.println(String.format("First Name: %s, Second Name: %s", firstName, secondName));
        STUDENT_FOR_TESTS.add(new StudentForTest(firstName, secondName));
        doGet(req, resp);
    }


}
