package com.operators.logical;

public class LogicalOperators {
	public static void main(String[] args) {

		boolean a = false;
		boolean b = true;

		boolean e = a && a;
		boolean f = a && b;
		boolean g = b && a;
		boolean h = b && b;

		System.out.println("AND Example:");
		System.out.println(a + " " + a + " " + e);
		System.out.println(a + " " + b + " " + f);
		System.out.println(b + " " + a + " " + g);
		System.out.println(b + " " + b + " " + h);

		boolean i = a || a;
		boolean j = a || b;
		boolean k = b || a;
		boolean m = b || b;

		System.out.println();
		System.out.println("OR Example:");
		System.out.println(a + " " + a + " " + i);
		System.out.println(a + " " + b + " " + j);
		System.out.println(b + " " + a + " " + k);
		System.out.println(b + " " + b + " " + m);

		boolean n = !a;
		boolean p = !b;

		System.out.println();
		System.out.println("NOT Example:");
		System.out.println(a + " " + n);
		System.out.println(b + " " + p);

		System.out.println();
		boolean q = 1 == 7;
		boolean r = 7 == 7;

		boolean s = r || q;
		System.out.println("s: " + s);

		boolean t = q && r;
		System.out.println("t: " + t);

		boolean u = 5 > 3 && r;
		System.out.println("u: " + u);

		boolean v = 5 < 6 && 7 > 6;
		System.out.println("v: " + v);

		boolean w = 8 < 9 || 4 > 3;
		System.out.println("w: " + w);

		boolean x = !(6 > 7);
		System.out.println("x: " + x);

		boolean y = (3 > 5 && 5 < 4) || 7 > 5;
		System.out.println("y: " + y);

		boolean z = 3 > 5 && (5 < 4 || 7 > 5);
		System.out.println("z: " + z);

		boolean ab = !(3 > 5 && (5 < 4 || 7 > 5));
		System.out.println("ab: " + ab);

	}
}
