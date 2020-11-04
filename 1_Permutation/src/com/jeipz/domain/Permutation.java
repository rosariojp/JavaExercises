package com.jeipz.domain;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	private String text;
	private List<String> permutations = new ArrayList<String>();
	
	public Permutation() {
		this.text = "";
	}
	
	public Permutation(String text) {
		setText(text);
	}
	
	private void findAllPermutations() {
		permute(text, 0, text.length());
	}
	
	private void permute(String text, int start, int end) {
		if (start == end - 1) {
			permutations.add(text);
		} else {
			for (int i = start; i < end; i++) {
				text = swap(text, start, i);
				permute(text, start + 1, end);
				text = swap(text, start, i);
			}
		}
	}
	
	private String swap(String text, int x, int y) {
		char[] charArray = text.toCharArray();
		char temp = charArray[x];
		charArray[x] = charArray[y];
		charArray[y] = temp;
		return String.valueOf(charArray);
	}
	
	public void setText(String text) {
		this.text = text;
		findAllPermutations();
	}
	
	public String getText() {
		return text;
	}
	
	public int getPermutationCount() {
		return permutations.size();
	}
	
	public List<String> getPermutations() {
		return permutations;
	}
	
}
