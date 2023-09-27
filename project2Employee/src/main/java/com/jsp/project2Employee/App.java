package com.jsp.project2Employee;

import com.jsp.project2Employee.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Mainn Starts");
     
      
        //EmployeeDao.employeeData(22,"venugopal","bangalore",908765);
        EmployeeDao.findEmployee(22);
        System.out.println("Main Ends");
    }
 
}

