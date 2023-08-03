package com.task;

public class SharedResource {

	private int number = 0;

	public void increment() {
		number++;
	}

	public int getSharedResourceValue() {
		return number;
	}
}
