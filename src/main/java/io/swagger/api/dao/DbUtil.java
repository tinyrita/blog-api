package io.swagger.api.dao;

import java.sql.*;


/**
 * Created by root on 16-6-6.
 */

    public class DbUtil {
        public static final String URL = "jdbc:mysql://anasit.com:3306/blog?useUnicode=true&characterEncoding=UTF-8";
        public static final String USER = "rita";
        public static final String PASSWORD = "rita";
//        private static Connection conn;


        public static Connection getConnection(){
            Connection conn = null;
                try {
                    //1.加载驱动程序
                    Class.forName("com.mysql.jdbc.Driver");
                    //2. 获得数据库连接
                    conn = DriverManager.getConnection(URL, USER, PASSWORD);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }


            return conn;
        }
    }

