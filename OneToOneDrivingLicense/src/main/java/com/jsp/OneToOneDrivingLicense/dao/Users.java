package com.jsp.OneToOneDrivingLicense.dao;
import com.jsp.OneToOneDrivingLicense.dto.LicenseDto;
import com.jsp.OneToOneDrivingLicense.dto.User;



public class Users implements DaoInterface{

	public static void AddUser()
	{
		LicenseDto license=new LicenseDto();
		license=UserInput.addLicense(license);
		User user =new User();
		user=UserInput.addUser(user);
		user.setLicense(license);
		
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		System.out.println("User Added Successfully");
		
	}
	
	public static void display() {
		int id=UserInput.getId();
		User user=manager.find(User.class,id);
		System.out.println("Name    :"+user.getUserName());
		System.out.println("Id      :"+user.getUserId());
		System.out.println("Ph      :"+user.getPhno());
		System.out.println("Address :"+user.getAddress());
		License.display(user.getLicense());
		
		
	}
	public static void removeUser()
	{
		int id=UserInput.getId();
		User user=manager.find(User.class,id);
		transaction.begin();
		manager.remove(user);
		manager.remove(user.getLicense());
		transaction.commit();
		System.out.println("Data Successfully removed");
	}
	public static void UpdateUser()
	{
		int id=UserInput.getId();
		User user=manager.find(User.class,id);
		user=UserInput.addUser(user);
		user.setLicense(UserInput.addLicense(user.getLicense()));
		
		
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		System.out.println("User updated Successfully");
		
		
	}
}
