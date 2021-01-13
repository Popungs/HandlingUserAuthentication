package com.hcl.login;

import java.util.ArrayList;
import java.util.List;

import com.hcl.user.User;

public class Login {
	
	private static List<User> LogList = new ArrayList<>();
	
	static { 
		LogList.add(new User("john","asdf","pleb"));
		LogList.add(new User("james","qwer","admin"));
		LogList.add(new User("johnny","1234","pleb"));
	}
	
	
	public boolean authentication(String uname, String password) {
		for (User u : LogList) {
			if (u.getPassword().equals(password) && u.getUsername().equals(uname)) {
				System.out.println("match found");
				return true;
			}
		}
		return false; 
	}
	public boolean authorization(String uname) {
		// if pleb -> return false, if admin -> return true;
		for (User u : LogList) {
			if (u.getUsername().equals(uname) && u.getPrivilege().equalsIgnoreCase("admin")) {
				System.out.println("admin found for uname : " + u.getUsername());
				return true;
			}
		}
		System.out.println("pleb found");
		return false;
	}

}
