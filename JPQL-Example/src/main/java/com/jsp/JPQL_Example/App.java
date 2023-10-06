package com.jsp.JPQL_Example;

import com.jsp.JPQL_Example.dao.Student_dao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Student_dao.insert();
        Student_dao.displayTable();
        Student_dao.Sorting();
    }
}
