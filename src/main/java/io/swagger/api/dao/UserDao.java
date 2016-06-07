package io.swagger.api.dao;

import io.swagger.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    //增加
    public void addUser(User user) throws SQLException {
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql
        String sql = "INSERT INTO Useruser(user_name, sex, age, birthday, email, mobile,"+
                "create_user, create_date, update_user, update_date, isdel)"
                +"values("+"?,?,?,?,?,?,?,CURRENT_DATE(),?,CURRENT_DATE(),?)";
        //预编译
        PreparedStatement ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行

        //传参
/*        ptmt.setString(1, user.getUser_name());
        ptmt.setInt(2, user.getSex());
        ptmt.setInt(3, user.getAge());
        ptmt.setDate(4, new Date(user.getBirthday().getTime()));
        ptmt.setString(5, user.getEmail());
        ptmt.setString(6, user.getMobile());
        ptmt.setString(7, user.getCreate_user());
        ptmt.setString(8, user.getUpdate_user());
        ptmt.setInt(9, user.getIsDel());*/

        //执行
        ptmt.execute();
    }

    public void updateUser(){
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "UPDATE Useruser" +
                " set user_name=?, sex=?, age=?, birthday=?, email=?, mobile=?,"+
                " update_user=?, update_date=CURRENT_DATE(), isdel=? "+
                " where id=?";
        //预编译
        PreparedStatement ptmt = null; //预编译SQL，减少sql执行
        try {
            ptmt = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //传参
/*        ptmt.setString(1, user.getUser_name());
        ptmt.setInt(2, user.getSex());
        ptmt.setInt(3, user.getAge());
        ptmt.setDate(4, new Date(user.getBirthday().getTime()));
        ptmt.setString(5, user.getEmail());
        ptmt.setString(6, user.getMobile());
        ptmt.setString(7, user.getUpdate_user());
        ptmt.setInt(8, user.getIsDel());
        ptmt.setInt(9, user.getId());*/

        //执行
        try {
            ptmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delUser(){
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "delete from Useruser where id=?";
        //预编译SQL，减少sql执行
        PreparedStatement ptmt = null;
        try {
            ptmt = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //传参
//        ptmt.setInt(1, id);

        //执行
        try {
            ptmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> query() throws SQLException {
        Connection conn = DbUtil.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT user_name, age FROM Useruser");

        List<User> users = new ArrayList<User>();
        User user = null;
        while(rs.next()){
            user = new User();
//            user.setUser_name(rs.getString("user_name"));
//            user.setAge(rs.getInt("age"));

            users.add(user);
        }
        return users;
    }

    public User useret(){
        User user = null;
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "select * from  Useruser where id=?";
        //预编译SQL，减少sql执行
        PreparedStatement ptmt = null;
        try {
            ptmt = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //传参
//        ptmt.setInt(1, id);
        //执行
        ResultSet rs = null;
        try {
            rs = ptmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next()){
//       User         user = new User();
    //            user.setId(rs.getInt("id"));
    //            user.setUser_name(rs.getString("user_name"));
    //            user.setAge(rs.getInt("age"));
    //            user.setSex(rs.getInt("sex"));
    //            user.setBirthday(rs.getDate("birthday"));
    //            user.setEmail(rs.getString("email"));
    //            user.setMobile(rs.getString("mobile"));
    //            user.setCreate_date(rs.getDate("create_date"));
    //            user.setCreate_user(rs.getString("create_user"));
    //            user.setUpdate_date(rs.getDate("update_date"));
    //            user.setUpdate_user(rs.getString("update_user"));
    //            user.setIsDel(rs.getInt("isdel"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}