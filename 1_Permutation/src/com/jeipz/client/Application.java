package com.jeipz.client;

import java.util.List;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.jeipz.test.PermutationTest;

public class Application {

	private static void reportResult(Result result) {
		System.out.println(
			"Finished. Result: Failures: " +
			result.getFailureCount() + ". Ignored: " +
			result.getIgnoreCount() + ". Tests run: " +
			result.getRunCount() + ". Time: " +
			result.getRunTime() + "ms."
		);
		if (result.getFailureCount() > 0) {
			System.out.println("\nFAILED TEST CASES: ");
			List<Failure> failedTestCases = result.getFailures();
			for (Failure testCase : failedTestCases) {
				System.out.println(testCase);
			}
		}
	}
	
	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		
		Result result = junit.run(PermutationTest.class);
		reportResult(result);
	}
	
}
