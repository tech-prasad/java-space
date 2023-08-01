package com.basics;

import java.util.List;

public class PolindromeExecutor extends Thread {

	private List<Integer> polindromeNumbers;

	public List<Integer> getPolindromeNumbers() {
		return polindromeNumbers;
	}

	@Override
	public void run() {
		Polindrome polindrome = new Polindrome();

		List<Integer> polindromes = polindrome.polindromes(10000);

		this.polindromeNumbers = polindromes;
	}
}
