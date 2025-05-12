package za.ac.Servlet;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.sessions.StudentFacadeLocal;
import za.ac.sessions.SchoolFacadeLocal;
import za.ac.models.Student;
import za.ac.models.School;

@WebServlet(name = "AddStudentServlet", urlPatterns = {"/AddStudentServlet"})
public class AddStudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;

    @EJB
    private SchoolFacadeLocal schoolFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // Receive and parse input
            Double amount = Double.parseDouble(request.getParameter("amountBalance"));
            String studentId = request.getParameter("studentId");
            Long schoolId = Long.parseLong(request.getParameter("school")); // assuming school is sent as ID

            // Fetch the School entity from DB
            School school = schoolFacade.find(schoolId);

            // Create and populate Student
            Student student = new Student();
            student.setStudentId(studentId);
            student.setAccountBalance(amount);
            student.setSchool(school);

            // Persist student
            studentFacade.create(student);

            // Set success message
            request.setAttribute("message", "Student added successfully.");
        } catch (Exception e) {
            // Handle errors
            request.setAttribute("message", "Error adding student: " + e.getMessage());
        }

        // Forward to JSP confirmation page
        request.getRequestDispatcher("confirmation.jsp").forward(request, response);
    }
}
