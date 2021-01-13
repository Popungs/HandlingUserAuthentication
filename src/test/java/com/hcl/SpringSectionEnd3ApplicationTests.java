package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.login.Login;

@SpringBootTest
class SpringSectionEnd3ApplicationTests {
	@Test
	void contextLoads() {
		System.out.println("context loaded");
	}
//	static Login log = new Login();
//
//	@Test
//	public void testingValidLogin1() {
//
//		assertEquals(true,log.authentication("john", "asdf"));
//	}
//
//	@Test
//	public void testingValidLogin2() {
//		assertTrue(log.authentication("james", "qwer"));
//	}
//
//	@Test
//	public void testingValidLogin3() {
//		assertTrue(log.authentication("johnny", "1234"));
//	}
//
//	@Test
//	public void testingInvalidLogin1() {
//		assertFalse(log.authentication("john", "asdff"));
//	}
//
//	@Test
//	public void testingInvalidLogin2() {
//		assertFalse(log.authentication("james", "QWER"));
//	}
//
//	@Test
//	public void testingInvalidLogin3() {
//		assertFalse(log.authentication("john", "QWER"));
//	}
//
//	@Test
//	public void testingInvalidLogin4() {
//		assertFalse(log.authentication("johnny", "asdf"));
//	}
//
//	@Test
//	public void testingInvalidLogin5() {
//		assertFalse(log.authentication("johnny", "4321"));
//	}
}

