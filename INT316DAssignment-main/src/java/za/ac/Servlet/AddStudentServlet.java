/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.sessions.*;
import za.ac.models.*;
import java.util.Exception;

/**
 *
 * @author ADMIN
 */
public class AddStudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal student;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            
        Student stud = new Student();
        }
        catch(Exception e)
            {
              request.setAttribute("error","Error occured and failed to add student");
            RequestDispatcher rd = request.getRequestDispatcher("error_page.jsp");
             rd.forward(request, response);
            }
       
    }

  

}
