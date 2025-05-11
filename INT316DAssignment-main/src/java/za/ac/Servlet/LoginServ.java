/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.models.*;
import za.ac.sessions.Display;
import za.ac.sessions.SchoolFacadeLocal;
import za.ac.sessions.StudentFacadeLocal;
import za.ac.sessions.TuckShopOwnerFacadeLocal;
import za.ac.sessions.UserFacadeLocal;

/**
 *
 * @author ADMIN
 */

public class LoginServ extends HttpServlet {

   
    @EJB
    private SchoolFacadeLocal schoolFacade;
      @EJB
    private TuckShopOwnerFacadeLocal tuck;
      @EJB
    private StudentFacadeLocal studs;
      @EJB Display display;
    @EJB
    private UserFacadeLocal user;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String username = request.getParameter("username");
    String password = request.getParameter("password");

    List<User> users = user.findAll();

           HttpSession session = request.getSession();
          
             
         display.setStud(studs.findAll());
                display.setTuck(tuck.findAll());
                 
         
            
           
               if (users != null && !users.isEmpty()) {
               for (User person : users) {
                   if ((person.getEmail().equals(username) || person.getUsername().equals(username)) 
                       && person.getPassword().equals(password)) {
                      
                       
                         if(person instanceof Admin)
                       {
                             session.setAttribute("students", display.getStud());
                            session.setAttribute("tuckshop", display.getTuck());
                            RequestDispatcher ad = request.getRequestDispatcher("admin_welcome.jsp");
                              ad.forward(request, response);
                              break;
                       }
                      

                      
                     
                       
                       if(person instanceof TuckShopOwner)
                       {
                         
                       
                        RequestDispatcher tk = request.getRequestDispatcher("tuckshop_welcome.jsp");
                       tk.forward(request, response);
                       break;
                       }
                       if(person instanceof Student){
                       RequestDispatcher st = request.getRequestDispatcher("student_welcome.jsp");
                       st.forward(request, response);
                       break;
                  
                   }
                   }
               }
               // If no match found after the loop
               request.setAttribute("message", "Invalid login details");
               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
               rd.forward(request, response);
           } else {
               request.setAttribute("message", "No users signed up");
               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
               rd.forward(request, response);
           }
    }

   
}
