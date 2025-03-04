package com.celivra.personnalms;

import com.celivra.personnalms.Entity.People;
import com.celivra.personnalms.Service.PeopleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UpdatePeople extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String birth = req.getParameter("birth");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String poli_look = req.getParameter("poli_look");
        People person = new People(id, name, gender, birth, email, phone, poli_look);
        PeopleService.update(person);
        resp.sendRedirect("/Dashboard.jsp");
    }
}
