package com.zahid;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest {
	@Test
	public void testUserLogin1() {
		UserLogin ul = new UserLogin();
		String uname = "abc";
		String pwd = "abc123";
		AssertJUnit.assertEquals(0, ul.login(uname, pwd));
	}
	
	@Test
	public void testUserLogin2() {
		UserLogin ul = new UserLogin();
		String uname = "abc";
		String pwd = "abc@123";
		AssertJUnit.assertEquals(0, ul.login(uname, pwd));
	}
}
