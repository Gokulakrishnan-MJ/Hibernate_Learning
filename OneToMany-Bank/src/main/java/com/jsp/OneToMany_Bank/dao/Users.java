package com.jsp.OneToMany_Bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.jsp.OneToMany_Bank.dto.BankDto;
import com.jsp.OneToMany_Bank.dto.UsersDto;

public class Users implements DaoInterface{
	
	public static List<UsersDto> addUser()
	{
		List<UsersDto> list=new ArrayList<UsersDto>();
		UsersDto users=new UsersDto();
		users=UserInput.addUser(users);
		transaction.begin();
		manager.persist(users);
		transaction.commit();
		list.add(users);
		
		System.out.println("user added Successfully");
		return list;
		
	}
	public static void updateUser()
	{
		int id=UserInput.getId();
		UsersDto users=   manager.find(UsersDto.class,id);
		users = UserInput.addUser(users);
		transaction.begin();
		manager.persist(users);
		transaction.commit();
		
		System.out.println("user updated Successfully");
	}
	public static void delete()
	{
		int id=UserInput.getId();
		UsersDto user = manager.find(UsersDto.class, id);
		transaction.begin();
		manager.remove(user);
		transaction.commit();
		System.out.println("User Deleted Successfully");
		
	}

}
