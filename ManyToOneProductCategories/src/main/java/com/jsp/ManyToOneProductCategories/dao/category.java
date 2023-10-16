package com.jsp.ManyToOneProductCategories.dao;

import com.jsp.ManyToOneProductCategories.dto.Categoriesdto;

public class category implements DaoInterface {

	public static void addCategory() {
		Categoriesdto category = new Categoriesdto();
		category = UserInput.addCategory(category);
		transaction.begin();
		manager.persist(category);
		transaction.commit();
	}

	public static void updateCategory() {
		int id = UserInput.getId();
		Categoriesdto category = manager.find(Categoriesdto.class, id);
		category = UserInput.addCategory(category);
		transaction.begin();
		manager.persist(category);
		transaction.commit();
	}

}
