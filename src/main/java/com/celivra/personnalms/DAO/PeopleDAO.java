package com.celivra.personnalms.DAO;

import com.celivra.personnalms.Entity.People;
import com.celivra.personnalms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeopleDAO {
    Connection connection = DBUtil.getConnection();
    public People findById(String id) {
        People people = null;
        String sql = "SELECT * FROM people WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                people = new People(rs.getString(1), rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getString(8));
            }
            return people;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public People findByName(String name) {
        People people = null;
        String sql = "SELECT * FROM people WHERE name= ?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                people = new People(rs.getString(1), rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getString(8));
            }
            return people;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean insert(People people) {
        String sql = "insert into people(name, gender, age, birth, email, phone, poli_look) values(?,?,?,?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, people.getName());
            ps.setString(2, people.getGender());
            ps.setString(3, people.getAge());
            ps.setString(4, people.getBirth());
            ps.setString(5, people.getEmail());
            ps.setString(6, people.getPhone());
            ps.setString(7, people.getPolilook());
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean update(People people) {
        String sql = "update people set name=?, gender=?, age=?, birth=?, email=?, phone=?, poli_look=? where id=?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, people.getName());
            ps.setString(2, people.getGender());
            ps.setString(3, people.getAge());
            ps.setString(4, people.getBirth());
            ps.setString(5, people.getEmail());
            ps.setString(6, people.getPhone());
            ps.setString(7, people.getPolilook());
            ps.setString(8, people.getId());
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean removeById(String id) {
        String sql = "DELETE FROM people WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, id);
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public List<People> findAll() {
        String sql = "SELECT * FROM people";
        List<People> peoples = new ArrayList<>();
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                peoples.add(new People(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getString(8)));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return peoples;
    }
}
