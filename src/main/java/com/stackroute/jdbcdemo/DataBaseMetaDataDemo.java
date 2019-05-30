package com.stackroute.jdbcdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseMetaDataDemo {

    public void getDataBaseMeta()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");

            DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

            con.close();
        }catch(Exception e) {
            System.out.println(e);
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

