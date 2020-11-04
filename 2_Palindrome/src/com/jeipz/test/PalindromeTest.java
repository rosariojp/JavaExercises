package com.jeipz.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jeipz.client.Palindrome;

public class PalindromeTest {

	@Test
	public void test() {
		String text = "";
		
		text = "ABACABA";
		assertTrue(Palindrome.isPalindrome(text));
		
		text = "LOLOLOLO";
		assertFalse(Palindrome.isPalindrome(text));
		
		text = "4600064";
		assertTrue(Palindrome.isPalindrome(text));
		
		text = "racecar";
		assertTrue(Palindrome.isPalindrome(text));
		
		text = "108012";
		assertFalse(Palindrome.isPalindrome(text));
	}
	
}
