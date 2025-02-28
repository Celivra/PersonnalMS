package com.celivra.personnalms;

import com.celivra.personnalms.Service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(UserService.selectUser(username) == null){
            HttpSession session = req.getSession();
            session.setAttribute("UserNotFound", true);
            resp.sendRedirect("/");
            return;
        }
        String dbPassword = UserService.selectUser(username).getPassword();
        if (dbPassword.equals(password)) {
            System.out.println("yes");
            HttpSession session = req.getSession();
            session.setAttribute("LoggedIn", username);
            resp.sendRedirect("Dashboard.jsp");
        }else{
            HttpSession session = req.getSession();
            session.setAttribute("NotPassword", true);
            resp.sendRedirect("/");
        }
    }
}
