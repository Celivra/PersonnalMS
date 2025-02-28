package com.celivra.personnalms.Service;

import com.celivra.personnalms.DAO.UserDAO;
import com.celivra.personnalms.Entity.User;

public class UserService {
    static UserDAO userDAO = new UserDAO();
    public static boolean inserUser(User user) {
        return userDAO.insertUser(user);
    }
    public static User selectUser(String username) {
        return userDAO.selectUser(username);
    }
}
