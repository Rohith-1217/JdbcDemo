package com.stackroute;

import com.stackroute.jdbcdemo.*;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        //DataManager Demo
        System.out.println( "DataManager" );
        DataManager dataManager=new DataManager();
        dataManager.getAllStudents();
        System.out.println();


        //Prepared Statement
        System.out.println("Prepared Statement1");
        PreparedStatementDemo preparedStatementDemo=new PreparedStatementDemo();
        preparedStatementDemo.getCourseByName("sai");
        System.out.println();

        System.out.println("Prepared Statement2");
        preparedStatementDemo.getCourseByNameAndDuration("rohith",12);
        System.out.println();


        //DataBaseMetaDataDemo
        System.out.println("DatabaseMetaData");
        DataBaseMetaDataDemo dataBaseMetaDataDemo=new DataBaseMetaDataDemo();
        dataBaseMetaDataDemo.getDataBaseMeta();
        System.out.println();


        //JdbcBatchProcessing
        System.out.println("JdbcBatchProcessing");
        JdbcBatchProcessing jdbcBatchProcessing=new JdbcBatchProcessing();
        jdbcBatchProcessing.getJdbcBatch();
        System.out.println("values successfully inserted");
        System.out.println();


        //JdbcTransaction
        System.out.println("JdbcTransaction");
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.getJdbcTransaction();
        System.out.println("values successfully updated");
        System.out.println();


        //ResultSetMetaDemoDemo
        System.out.println("ResultSetMetaDataDemo");
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.getResultSet();
        System.out.println();


        //RowSetDemo
        System.out.println("RowSetDemo");
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.getAllNames();
        rowSetDemo.getCourseByName("tarak");
        rowSetDemo.getCourseByNameAndDuration("dhoni",7);
    }
}
