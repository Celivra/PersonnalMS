package com.celivra.personnalms;

import com.celivra.personnalms.Entity.People;
import com.celivra.personnalms.Entity.User;
import com.celivra.personnalms.Service.PeopleService;
import com.celivra.personnalms.Service.UserService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String birth = req.getParameter("birth");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String poli_look = req.getParameter("poli_look");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        People people = new People(name, gender, birth, email,phone,poli_look, "celivra", username, password);
        System.out.println(PeopleService.insert(people));
        res.sendRedirect("/");
    }
}
