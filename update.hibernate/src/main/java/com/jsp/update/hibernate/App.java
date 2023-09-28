package com.jsp.update.hibernate;

import com.jsp.update.hibernate.dao.deleteRecord;
import com.jsp.update.hibernate.dao.insert;
import com.jsp.update.hibernate.dao.update;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("Program Starts");
        //insert.inserdata();
    	//update.updatedata(4,"Bond");
    	deleteRecord.delete(3);
        System.out.println("Program Ends");
    }
}
