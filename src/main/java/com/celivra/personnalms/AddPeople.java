package com.celivra.personnalms;

import com.celivra.personnalms.DAO.PeopleDAO;
import com.celivra.personnalms.Entity.People;
import com.celivra.personnalms.Service.AddPeopleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddPeople extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String birth = req.getParameter("birth");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String poli_look = req.getParameter("poli_look");

        People people = new People(name, gender, age, birth, email, phone, poli_look);
        AddPeopleService.insert(people);
        resp.sendRedirect("/Dashboard.jsp");
    }
}
