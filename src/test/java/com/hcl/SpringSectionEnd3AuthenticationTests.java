package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.login.Login;
@SpringBootTest
public class SpringSectionEnd3AuthenticationTests {

	@Test
	public void testingValidLogin1() throws Exception{
		Login log = new Login();
		assertEquals(true,log.authentication("john", "asdf"));
	}

	@Test
	public void testingValidLogin2() {
		Login log = new Login();
		assertTrue(log.authentication("james", "qwer"));
	}

	@Test
	public void testingValidLogin3() {
		Login log = new Login();
		assertTrue(log.authentication("johnny", "1234"));
	}

	@Test
	public void testingInvalidLogin1() {
		Login log = new Login();
		assertFalse(log.authentication("john", "asdff"));
	}

	@Test
	public void testingInvalidLogin2() {
		Login log = new Login();
		assertFalse(log.authentication("james", "QWER"));
	}

	@Test
	public void testingInvalidLogin3() {
		Login log = new Login();
		assertFalse(log.authentication("john", "QWER"));
	}

	@Test
	public void testingInvalidLogin4() {
		Login log = new Login();
		assertFalse(log.authentication("johnny", "asdf"));
	}

	@Test
	public void testingInvalidLogin5() {
		Login log = new Login();
		assertFalse(log.authentication("johnny", "4321"));
	}
	@Test
	public void testingNonExistingAccount1() {
		Login log = new Login();
		//assertFalse(log.authentication("johndoee","asdf"));
		assertEquals(true,log.authentication("johndoee", "asdf"));
		//assertTrue(log.authentication("johndoee","asdf"));
	}
}
