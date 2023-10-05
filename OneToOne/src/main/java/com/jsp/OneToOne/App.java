package com.jsp.OneToOne;

import java.util.Scanner;

import com.jsp.OneToOne.dao.Aadhar_dao;
import com.jsp.OneToOne.dao.Person_dao;
import com.jsp.OneToOne.dto.Aadhar;
public class App {
	public static void main(String[] args) {
		System.out.println("Aadhar Based Management System");
		Person_dao.insertPersonData();
		//Aadhar_dao.UpdateAadhar();
		//Person_dao.UpdatePersonData();

	}
}
