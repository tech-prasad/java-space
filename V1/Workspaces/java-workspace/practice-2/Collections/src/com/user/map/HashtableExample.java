package com.user.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {

		Map<String, Integer> students = new Hashtable<>();

		System.out.println(students.size()); // 0
		System.out.println(students.isEmpty()); // true

		students.put("Anil", 567);

		System.out.println(students.size()); // 1
		System.out.println(students.isEmpty()); // false

		students.put("Chandu", 345);
		students.put("Bharat", 455);

		System.out.println(students.size()); // 3
		System.out.println(students.isEmpty()); // false

		students.put("Anil", 456);

		System.out.println(students.size()); // 3
		System.out.println(students.isEmpty()); // false

		System.out.println(students.containsKey("Bharat"));// true
		System.out.println(students.containsValue(567));// false

		System.out.println(students.size()); // 3
		students.remove("Chandu");
		System.out.println(students.size()); // 2

		Integer total = students.get("Bharat");
		System.out.println(total);

		Integer total2 = students.get("Test");
		System.out.println(total2);

		Map<String, Integer> juniors = new HashMap<>();
		juniors.put("Sam", 453);
		juniors.put("John", 345);
		juniors.put("jac", 555);

		students.putAll(juniors);

		System.out.println(students.size()); // 6

		Set<String> set = students.keySet();

		for (String s : set) {
			Integer t = students.get(s);

			System.out.println(s + " : " + t);
		}

		Collection<Integer> values = students.values();

		for (Integer integer : values) {
			System.out.println(integer);
		}

		System.out.println(students.size()); // 6
		students.remove("Bharat");
		System.out.println(students.size()); // 5

		Set<Entry<String, Integer>> entrySet = students.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		students.clear();

		System.out.println(students.size()); // 0
		System.out.println(students.isEmpty()); // true
	}
}
