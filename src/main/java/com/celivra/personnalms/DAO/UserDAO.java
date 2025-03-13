package com.celivra.personnalms.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.celivra.personnalms.Entity.User;
import com.celivra.personnalms.util.DBUtil;

public class UserDAO {
    Connection connection = DBUtil.getConnection();
    public boolean insertUser(User user) {
        if(selectUser(user.getUsername()) != null) {
            return  false;
        }
        String sql = "insert into users(username, password, email) values(?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public User selectUser(String username) {
        String sql = "select * from users where username=?";
        User user = null;
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}
