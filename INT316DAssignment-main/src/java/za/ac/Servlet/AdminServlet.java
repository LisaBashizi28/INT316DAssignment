/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.AbstractList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.models.School;
import za.ac.models.Student;
import za.ac.models.TuckShopOwner;
import za.ac.models.User;
import za.ac.sessions.Display;
import za.ac.sessions.SchoolFacadeLocal;
import za.ac.sessions.StudentFacadeLocal;
import za.ac.sessions.TuckShopOwnerFacadeLocal;
import za.ac.sessions.UserFacadeLocal;

/**
 *
 * @author ADMIN
 */
public class AdminServlet extends HttpServlet {
  @EJB
    private SchoolFacadeLocal schoolFacade;
      @EJB
    private TuckShopOwnerFacadeLocal tuck;
      @EJB
    private StudentFacadeLocal studs;
      @EJB Display display;
    @Override
       protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            String button = request.getParameter("button");
          
            
           
           
       }
   
    @Override
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            String button = request.getParameter("button");
          
             HttpSession session = request.getSession();
          
             
         display.setStud(studs.findAll());
                display.setTuck(tuck.findAll());
                 
           session.setAttribute("students", display.getStud());
             session.setAttribute("tuckshop", display.getTuck());
           
           if(button.equals("add"))
           {
               
                String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    String schoolId = request.getParameter("school");
    
        TuckShopOwner owner = new TuckShopOwner();
            owner.setFirstName(name);
            owner.setLastName(surname);
            owner.setEmail(email);
            owner.setUsername(username);
            owner.setPassword(password);
            owner.setId(Long.parseLong("5"));
            School school = new School("Dansa", "Francis");
            schoolFacade.create(school);
            owner.setSchool(school);
            tuck.create(owner);
            
              request.setAttribute("true", true);
            
           
           RequestDispatcher rd = request.getRequestDispatcher("admin_welcome.jsp");
               rd.forward(request, response);
           }
          
    }

    

    
}
