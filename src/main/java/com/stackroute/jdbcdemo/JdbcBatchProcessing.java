package com.stackroute.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchProcessing {
    public void getJdbcBatch() {
        Connection con = null;

        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");


            Statement stmt = con.createStatement();
            stmt.addBatch("insert into course values(104,'jagan',80)");
            stmt.addBatch("insert into course values(105,'lokesh',90)");
            //stmt.addBatch("insert into course values(103,'kalyan',60)");

            stmt.executeBatch();//executing the batch

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Exception thrown" + cnfe.getStackTrace());
        } catch (SQLException sqlException) {
            System.out.println("Exception Thrown" + sqlException.getStackTrace());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

