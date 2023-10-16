package com.jsp.OneToMany_Bank.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jsp.OneToMany_Bank.dto.BankDto;
import com.jsp.OneToMany_Bank.dto.UsersDto;

public class Bank implements DaoInterface {

	public static void addBank() {
		BankDto bank = new BankDto();
		List<UsersDto> list=new ArrayList<UsersDto>();
		bank=UserInput.addBank(bank);
		list=Users.addUser();
		bank.setUsers(list);
		transaction.begin();
		manager.persist(bank);
		transaction.commit();
		
		System.out.println("Bank Added Successfully");

	}

	public static void updateBank() {
		int id = UserInput.getId();
		BankDto bank = manager.find(BankDto.class, id);
		UserInput.addBank(bank);
		transaction.begin();
		manager.persist(bank);
		transaction.commit();
		System.out.println("Bank Updated Successfully");
	}

	public static void display()
	{
		int id=UserInput.getId();
		BankDto bank = manager.find(BankDto.class, id);
		System.out.println("Branch ID : "+bank.getBankId());
		System.out.println("IFSC Code"+bank.getIfscCode());
		System.out.println("Manager Name :"+bank.getManagerName());
		System.out.println("Locaction :"+bank.getLocation());
		
		Iterator< UsersDto> iterator =bank.getUsers().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	public static void delete()
	{
		int id=UserInput.getId();
		BankDto bank = manager.find(BankDto.class, id);
		transaction.begin();
		manager.remove(bank);
		transaction.commit();
		System.out.println("User Deleted Successfully");
		
	}

}
