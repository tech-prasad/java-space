package com.number.test;

public class Numbers {

	public void print() {
		byte b = Byte.parseByte("109");
		
		System.out.println(b);
	}

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.print();
	}

}
