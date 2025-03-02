package com.celivra.personnalms.DAO;

import com.celivra.personnalms.Entity.People;
import com.celivra.personnalms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddPeopleDAO {
    Connection connection = DBUtil.getConnection();
    public boolean insert(People people) {
        String sql = "INSERT INTO people(name, gender, age, birth, email, phone, poli_look) VALUES (?,?,?,?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, people.getName());
            ps.setString(2, people.getGender());
            ps.setString(3, people.getAge());
            ps.setString(4, people.getBirth());
            ps.setString(5, people.getEmail());
            ps.setString(6, people.getPhone());
            ps.setString(7, people.getPoli_look());
            ps.executeUpdate();
            connection.close();
            ps.close();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
