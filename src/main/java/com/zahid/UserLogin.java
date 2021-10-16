package com.zahid;

import java.util.ResourceBundle;

public class UserLogin {
	public int login(String username, String password) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String uname = rb.getString("uname");
		String pwd = rb.getString("pwd");
		
		if (uname.equals(username) && pwd.equals(password)) {
			return 1;
		} else {
			return 0;
		}
	}
}
