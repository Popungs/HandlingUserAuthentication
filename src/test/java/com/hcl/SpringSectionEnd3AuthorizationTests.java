package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.login.Login;

@SpringBootTest
public class SpringSectionEnd3AuthorizationTests {
	
	@Test
	public void testingAdmin1() {
		 Login log = new Login();
		String uname = "john";
		assertEquals(false, log.authorization(uname));
	}
	@Test
	public void testingAdmin2() {
		 Login log = new Login();
		String uname = "johnny";
		assertEquals(false, log.authorization(uname));
	}
	@Test
	public void testingAdmin3() {
		 Login log = new Login();
		String uname = "james";
		assertEquals(true, log.authorization(uname));
	}

	@Test
	public void testingNonExistingUser() {
		 Login log = new Login();
		String uname = "bigJohnny";
		assertFalse(log.authorization(uname));
	}

}
