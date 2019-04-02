package com.sample.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void whenEmptyString_thenAccept() {
		App palindromeTester = new App();
		assertTrue(palindromeTester.isPalindrome(""));
	}
	
	
	@Test
	public void whenEmptyString_thenAccept1() {
		App palindromeTester = new App();
		assertTrue(palindromeTester.isPalindrome("noon"));
	}
	
	@Test
	public void whenEmptyString_thenAccept2() {
		App palindromeTester = new App();
		assertTrue(palindromeTester.isPalindrome("noon"));
	}
}
