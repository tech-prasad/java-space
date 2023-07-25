package com.user.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> names = new HashSet<>();

		System.out.println(names.size()); // 0
		System.out.println(names.isEmpty()); // true

		names.add("Anil");

		System.out.println(names.size()); // 1
		System.out.println(names.isEmpty());// false

		names.add("Bharat");
		names.add("Chandu");
		names.add("Chandu");

		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.print(name + " ");
		}
		System.out.println();

		System.out.println(names.contains("Bharat"));// true
		System.out.println(names.contains("bharat"));// false

		System.out.println(names.size()); // 3
		names.remove("Chandu");
		System.out.println(names.size()); // 2

		Set<String> subNames = new HashSet<>();

		subNames.add("jack");
		subNames.add("john");
		subNames.add("Smith");

		names.addAll(subNames);

		System.out.println(names.size()); // 5

		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		names.add(null);
		names.add(null);
		names.add(null);
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

		names.clear();

		System.out.println(names.size()); // 0
		System.out.println(names.isEmpty()); // true

		for (String name : names) {// Nothing to print
			System.out.print(name + " ");
		}
	}
}
