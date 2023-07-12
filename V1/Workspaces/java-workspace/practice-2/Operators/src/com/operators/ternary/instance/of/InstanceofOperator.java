package com.operators.ternary.instance.of;

class Parent {
	int a = 10;

	public void print() {
		System.out.println("Parent a: " + a);
	}
}
class Child extends Parent {

	public void print() {
		System.out.println("Child a: " + a);
	}
}
public class InstanceofOperator {
	public static void main(String[] args) {

		Parent p = new Child();

		p.print();

		boolean x = p instanceof Child;

		System.out.println("x: " + x);

		boolean y = p instanceof Parent;

		System.out.println("y: " + y);

		Parent p2 = null;

		boolean z = p2 instanceof Parent;

		System.out.println("z: " + z);
	}
}
