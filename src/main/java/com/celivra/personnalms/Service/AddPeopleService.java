package com.celivra.personnalms.Service;

import com.celivra.personnalms.DAO.AddPeopleDAO;
import com.celivra.personnalms.Entity.People;

public class AddPeopleService {
    static AddPeopleDAO addPeopleDAO = new AddPeopleDAO();
    public static boolean insert(People people) {
        return addPeopleDAO.insert(people);
    }
}
