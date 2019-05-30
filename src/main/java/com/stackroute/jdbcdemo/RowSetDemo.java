package com.stackroute.jdbcdemo;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowSetDemo {
    public void getAllNames()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating and Executing RowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/student");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from course");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id: " + rowSet.getString(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Duration: " + rowSet.getInt(3));
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Exception thrown" + cnfe.getStackTrace());
        } catch (SQLException sqlException) {
            System.out.println("Exception Thrown" + sqlException.getStackTrace());
        }
    }

    public void getCourseByName(String name)
    {

    }

    public void getCourseByNameAndDuration(String name,int duration)
    {

    }
}
