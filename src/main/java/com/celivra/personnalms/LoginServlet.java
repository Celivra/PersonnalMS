package com.celivra.personnalms;

import com.celivra.personnalms.Entity.People;
import com.celivra.personnalms.Service.PeopleService;
import com.celivra.personnalms.Service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import com.celivra.personnalms.Entity.User;

import javax.lang.model.element.PackageElement;

public class LoginServlet extends HttpServlet {
    static User loginUser = null;
    static People loginPeople= null;
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        loginUser = UserService.selectUser(username);
        loginPeople = PeopleService.findByUserName(username);
        if(loginUser == null && loginPeople == null){
            HttpSession session = req.getSession();
            session.setAttribute("UserNotFound", true);
            resp.sendRedirect("/");
            return;
        }
        String dbPassword;
        if(loginUser != null){
            dbPassword = loginUser.getPassword();
            if (dbPassword.equals(password)) {
                HttpSession session = req.getSession();
                session.setAttribute("LoggedIn", username);
                resp.sendRedirect("Dashboard.jsp");
            }else{
                HttpSession session = req.getSession();
                session.setAttribute("NotPassword", true);
                resp.sendRedirect("/");
            }
        }
        else if(loginPeople != null){
            dbPassword = loginPeople.getPassword();
            if (dbPassword.equals(password)) {
                HttpSession session = req.getSession();
                session.setAttribute("LoggedIn", username);
                resp.sendRedirect("PeopleDashboard.jsp");
            }else{
                HttpSession session = req.getSession();
                session.setAttribute("NotPassword", true);
                resp.sendRedirect("/");
            }
        }
    }
    public static String getLoggedUser() {
        return loginUser.getUsername();
    }
}
