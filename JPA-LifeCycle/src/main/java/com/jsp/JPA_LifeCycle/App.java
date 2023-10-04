package com.jsp.JPA_LifeCycle;

import com.jsp.JPA_LifeCycle.dao.ProductDao;
import com.jsp.JPA_LifeCycle.dao.ProductInterface;
import com.jsp.JPA_LifeCycle.dto.*;

/**
 * JPA - Java Persistence API
 * it is an API which Facilitates Object Relational Mapping using Java Objects instead of SQL Queries
 * 
 * API is used to interact between two different Environments
 *  
 *  
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ProductDao p1=new ProductDao();
       	p1.saveProduct();
        
    }
}
