package com.jsp.OneToMany_Bank.dao;

import java.util.List;

import com.jsp.OneToMany_Bank.dto.UsersDto;

public class Users implements DaoInterface{
	
	public static void addUser()
	{
		UsersDto users=new UsersDto();
		UserInput.addUser(users);
		transaction.begin();
		manager.persist(users);
		transaction.commit();
		System.out.println("user updated Successfully");
		
	}

	public static void removeUsers() {
		// TODO Auto-generated method stub
		System.out.println("Enter id :");
		int id=UserInput.getId();
		UsersDto users=manager.find(UsersDto.class,id);
		transaction.begin();
		manager.persist(users);
		transaction.commit();
		
	}

}
