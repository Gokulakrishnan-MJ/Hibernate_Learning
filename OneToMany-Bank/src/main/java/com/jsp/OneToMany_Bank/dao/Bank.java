package com.jsp.OneToMany_Bank.dao;

import com.jsp.OneToMany_Bank.dto.BankDto;

public class Bank implements DaoInterface {

	public static void addBank() {
		BankDto bank = new BankDto();

		UserInput.addBank(bank);
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

	public static void deleteBank() {
		int id = UserInput.getId();
		BankDto bank = manager.find(BankDto.class, id);
		transaction.begin();
		Users.removeUsers(id);
		manager.remove(bank);
		transaction.commit();
		System.out.println("Bank Updated Successfully");
	}

}
