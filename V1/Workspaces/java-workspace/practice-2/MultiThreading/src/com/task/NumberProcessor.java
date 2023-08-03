package com.task;

import java.util.List;

public class NumberProcessor {

	public static void main(String[] args) throws InterruptedException {

		PolindromeExecutor polindromeExecutor = new PolindromeExecutor();

		polindromeExecutor.start();

		PrimeExecutor primeExecutor = new PrimeExecutor();

		primeExecutor.start();

		polindromeExecutor.join();

		primeExecutor.join();

		List<Integer> polindromeNumbers = polindromeExecutor.getPolindromeNumbers();

		System.out.println(polindromeNumbers);

		List<Integer> primeNumbers = primeExecutor.getPrimeNumbers();

		System.out.println(primeNumbers);

	}

}
