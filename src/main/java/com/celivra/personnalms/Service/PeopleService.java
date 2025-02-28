package com.celivra.personnalms.Service;

import com.celivra.personnalms.DAO.PeopleDAO;
import com.celivra.personnalms.Entity.People;

import java.util.List;

public class PeopleService {
    static PeopleDAO peopleDAO = new PeopleDAO();
    public static People findById(String id) {
        return peopleDAO.findById(id);
    }
    public static People findByName(String name) {
        return peopleDAO.findByName(name);
    }
    public static boolean insert(People people){
        return peopleDAO.insert(people);
    }
    public static List<People> findAll() {
        return peopleDAO.findAll();
    }
}
