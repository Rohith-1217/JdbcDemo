package com.stackroute.jdbcdemo;

import java.sql.*;

public class ResultSetMetaDataDemo {

public void getResultSet()
    {
        Connection con=null;
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con=DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/student", "root", "Root@123");

                    PreparedStatement ps=con.prepareStatement("select * from course");
                    ResultSet rs=ps.executeQuery();
                    ResultSetMetaData rsmd=rs.getMetaData();

                    System.out.println("Total columns: "+rsmd.getColumnCount());
                    System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
                    System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

                    con.close();
                }catch(Exception e){
                    System.out.println(e);}
                finally {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

    }
}





