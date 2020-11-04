package com.jeipz.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.jeipz.domain.Permutation;

public class PermutationTest {

	@Test
	public void testPermutationCount() {
		Permutation permutation = new Permutation();
		assertEquals(0, permutation.getPermutationCount());
		
		String text = "ABCDEF";
		permutation.setText(text);
		assertEquals(720, permutation.getPermutationCount());
	}
	
	@Test
	public void testConstructorWithParam() {
		String text = "ABCDE";
		Permutation permutation = new Permutation(text);
		assertEquals("ABCDE", permutation.getText());
		assertEquals(120, permutation.getPermutationCount());
		
		List<String> permutations = permutation.getPermutations();
		assertEquals(120, permutations.size());
	}

}
