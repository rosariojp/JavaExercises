package com.jeipz.client;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.jeipz.test.PalindromeTest;

public class Palindrome {

	public static boolean isPalindrome(String text) {
		StringBuilder sb = new StringBuilder(text);
		return text.equals(sb.reverse().toString());
	}
	
	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		Result result = junit.run(PalindromeTest.class);
		if (result.getFailureCount() > 0) {
			System.out.println("-- Failed test cases --");
			for (Failure testCase : result.getFailures()) {
				System.out.println(testCase.getDescription());
				System.out.println(testCase.getTrimmedTrace());
			}
		}
	}
	
}
