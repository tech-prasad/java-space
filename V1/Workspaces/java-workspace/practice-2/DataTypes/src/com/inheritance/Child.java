package com.inheritance;

public class Child extends Parent {

	public void print() {
		System.out.println("print from child");
	}

	public static void main(String[] args) {
				
		Parent reference = new Child();
		
		Child c = (Child)reference;

		c.print();
	}

}
