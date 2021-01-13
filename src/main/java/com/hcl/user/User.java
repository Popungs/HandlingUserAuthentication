package com.hcl.user;

public class User {
	private String username;
	private String password;
	private String privilege;
	


	public User(String username, String password,String privilege) {
		super();
		this.username = username;
		this.password = password;
		this.privilege = privilege;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", privilege=" + privilege + "]";
	}

	
	

}
