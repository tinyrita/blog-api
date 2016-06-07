package io.swagger.api.dao;

import io.swagger.api.dao.DbUtil;
import io.swagger.model.Blog;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class BlogDao {

    public List<Blog> query() {
        List<Blog> blogs = new ArrayList<Blog>();
        Connection conn = DbUtil.getConnection();
        Statement stmt = null;

        try {
            stmt = conn.createStatement();

        ResultSet rs = null;

            rs = stmt.executeQuery("SELECT * FROM blogarticle");


        Blog blog = null;
            while(rs.next()){
                blog = new Blog();
                blog.setId(rs.getInt("blogID"));
                blog.setOid(rs.getInt("bloggerID"));
                blog.setName(rs.getString("blogTitle"));
                blog.setContent(rs.getString("blogContent"));
                //blog.setPostdate(rs.getTimestamp("publishTime"));

                blogs.add(blog);
            }

            conn.close();

        }  catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }

    public Blog get(String id) {
        Blog blog = null;
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "select * from blogarticle where blogID=?";
        //预编译SQL，减少sql执行
        PreparedStatement ptmt = null;
        try {
            ptmt = conn.prepareStatement(sql);

        //传参
        ptmt.setString(1, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //执行
        ResultSet rs = null;
        try {
            rs = ptmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            while(rs.next()){
            blog = new Blog();
                blog.setId(rs.getInt("blogID"));
                blog.setOid(rs.getInt("bloggerID"));
                blog.setName(rs.getString("blogTitle"));
                blog.setContent(rs.getString("blogContent"));
                //blog.setPostdate(rs.getTimestamp("publishTime"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blog;
    }
}
