package com.java.todo;
import java.util.*;
public class UserService {
	Map<String,String> user=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	public void Register() {
		System.out.println("**User Registration**");
		System.out.print("Enter Username: ");
		String userName=sc.next();
		if(user.containsKey(userName)) {
			System.out.println("Username already taken! Please choose a different one.");
			return;
		}
		else {
			System.out.print("Enter Password: ");
			String password=sc.next();
			user.put(userName, password);
			System.out.println("Register successfully ! You can Login now . ");
		}
	}
	
	public boolean Login() {
		System.out.println("**User Login**");
		System.out.print("Enter Username: ");
		String userName=sc.next();
		if(!user.containsKey(userName)) {
			System.out.println("Username not found! Please register first.");
			return false;
		}
		else {
			System.out.print("Enter Password: ");
			String password=sc.next();
			if(user.get(userName).equals(password)) {
				System.out.println("Login successful! Welcome to TO-DO List Application , " + userName +" ! ");
				return true;
			}else {
				System.out.println("Incorrect password. Please try again");
				return false;
			}
		}
	}
}
