package com.task;

import java.util.List;

public class PrimeExecutor extends Thread {

	private List<Integer> primeNumbers;

	public List<Integer> getPrimeNumbers() {
		return primeNumbers;
	}

	@Override
	public void run() {
		Prime prime = new Prime();

		List<Integer> primeNumbers = prime.primes(10000);

		this.primeNumbers = primeNumbers;
	}

}
