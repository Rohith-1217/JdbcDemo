package com.stackroute.jdbcdemo;

import java.sql.*;

public class PreparedStatementDemo {

    public void getCourseByName(String name) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");
            PreparedStatement stmt = connection.prepareStatement("select * from course where name=?");
            stmt.setString(1, name);
            ResultSet resultSet=stmt.executeQuery();
            while(resultSet.next())
            {
                int id=resultSet.getInt(1);
                String dbName=resultSet.getString(2);
                int dBDuration=resultSet.getInt(3);
                System.out.println(id+" "+dbName+" "+dBDuration);
            }
            //System.out.println(i + " records inserted");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Exception thrown" + cnfe.getStackTrace());
        } catch (SQLException sqlException) {
            System.out.println("Exception Thrown" + sqlException.getStackTrace());
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void getCourseByNameAndDuration(String name,int duration)
    {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");
            PreparedStatement stmt = connection.prepareStatement("select * from course where name=? and duration=?");
            stmt.setString(1, name);
            stmt.setInt(2,duration);
            ResultSet resultSet=stmt.executeQuery();
            while(resultSet.next())
            {
                int id=resultSet.getInt("id");
                String dbName=resultSet.getString("name");
                int dBDuration=resultSet.getInt("duration");
                System.out.println(id+" "+dbName+" "+dBDuration);
            }
            /*System.out.println(i + " records inserted");*/
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Exception thrown" + cnfe.getStackTrace());
        } catch (SQLException sqlException) {
            System.out.println("Exception Thrown" + sqlException.getStackTrace());
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}