package com.celivra.personnalms;

import com.celivra.personnalms.Entity.User;
import com.celivra.personnalms.Service.UserService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = new User(username, password, email);
        System.out.println(UserService.inserUser(user));
        res.sendRedirect("/");
    }
}
