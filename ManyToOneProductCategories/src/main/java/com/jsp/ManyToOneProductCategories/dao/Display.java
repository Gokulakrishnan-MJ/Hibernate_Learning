package com.jsp.ManyToOneProductCategories.dao;

import java.util.List;

import com.jsp.ManyToOneProductCategories.dto.Categoriesdto;

import jakarta.persistence.Query;

public class Display implements DaoInterface{

	public static void displayCategories() {

		Query query = manager.createQuery("select c from Categoriesdto c ");
		List<Categoriesdto> list = query.getResultList();
		System.out.println("========================================================================");
		System.out.println("CategoryID\tCategory Name");
		for (Categoriesdto category : list) {
			System.out.println( category.getCategoryId()+ "\t\t" + category.getCategoryName());
		}
		System.out.println("========================================================================");

	}
}
