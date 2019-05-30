package com.stackroute.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {
    public void getJdbcTransaction()
    {
        Connection con=null;
        try {
        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //obtain connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");
        con.setAutoCommit(false);

        Statement stmt=con.createStatement();
        stmt.executeUpdate("insert into course values(202,'dhoni',7)");
        stmt.executeUpdate("insert into course values(203,'raina',48)");

        con.commit();
        con.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Exception thrown" + cnfe.getStackTrace());
        } catch (SQLException sqlException) {
            System.out.println("Exception Thrown" + sqlException.getStackTrace());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
