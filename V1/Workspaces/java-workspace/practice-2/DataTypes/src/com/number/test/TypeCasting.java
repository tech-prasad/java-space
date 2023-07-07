package com.number.test;

public class TypeCasting {

	public byte byteVariable = 126;
	public short shortVariable = -32765;
	public int intVariable = 999999999;
	public long longVariable = 9999999999999999L;
	public float floatVariable = 45.7f;
	public double doubleVariable = 99.77;

	public boolean isActive = true;

	public char gender = 'M';

	public void print() {
		int value = (int)doubleVariable;
		
		System.out.println(value);
	}

	public static void main(String[] args) {
		TypeCasting casting = new TypeCasting();
		casting.print();
	}
}
