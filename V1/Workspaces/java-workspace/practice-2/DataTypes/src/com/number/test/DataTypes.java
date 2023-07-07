package com.number.test;

public class DataTypes {

	public byte byteVariable = 126;
	public short shortVariable = -32765;
	public int intVariable = 999999999;
	public long longVariable = 99999999909546456L;
	public float floatVariable = 45.7f;
	public double doubleVariable = 99.77;

	public boolean isActive = true;

	public char gender = 'M';

	public void print() {
		System.out.println("byteVariable: " + byteVariable);
		System.out.println("shortVariable: " + shortVariable);
		System.out.println("intVariable: " + intVariable);
		System.out.println("longVariable: " + longVariable);
		System.out.println("floatVariable: " + floatVariable);
		System.out.println("doubleVariable: " + doubleVariable);
		System.out.println("isActive: " + isActive);
		System.out.println("gender: " + gender);
	}

	public static void main(String[] args) {
		DataTypes numbers = new DataTypes();
		numbers.print();
	}
}
