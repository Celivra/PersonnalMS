package com.celivra.personnalms;

import com.celivra.personnalms.Service.PeopleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class DeletePeople extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("deleteID");
        HttpSession session = req.getSession();
        if(PeopleService.findById(id) == null) {
           session.setAttribute("DeleteError", "Can't delete people");
        }else{
            PeopleService.removeById(id);
            session.setAttribute("DeleteComplete", "delete people successfully");
        }
        resp.sendRedirect("/Dashboard.jsp");
    }
}
