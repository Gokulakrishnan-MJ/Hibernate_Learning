package com.jsp.OneToMany_ProductCategories.dao;

import com.jsp.OneToMany_ProductCategories.dto.CategoriesDto;

public class Category {

	public static void addcategory() {
		CategoriesDto category =new CategoriesDto();
		category =UserInput.addUser(category);
		
		
	}

}
