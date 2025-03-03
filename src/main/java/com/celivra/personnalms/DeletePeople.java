package com.celivra.personnalms;

import com.celivra.personnalms.Service.PeopleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DeletePeople extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("deleteID");
        PeopleService.removeById(id);
        resp.sendRedirect("/Dashboard.jsp");
    }
}
