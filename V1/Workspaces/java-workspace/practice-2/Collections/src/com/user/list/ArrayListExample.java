package com.user.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		System.out.println(numbers.isEmpty()); // true

		System.out.println(numbers.size()); // 0

		numbers.add(34);

		System.out.println(numbers.isEmpty()); // false

		System.out.println(numbers.size()); // 1

		numbers.add(35);

		System.out.println(numbers.add(75)); // true

		System.out.println(numbers.size()); // 3

		System.out.println(numbers.contains(100)); // false
		System.out.println(numbers.contains(75)); // true

		System.out.println(numbers.get(0)); // 34
		System.out.println(numbers.get(numbers.size() - 1)); // 75

		// remove by object
		System.out.println(numbers.remove(Integer.valueOf(34))); // true
		System.out.println(numbers.size()); // 2
		System.out.println(numbers.get(0)); // 35

		numbers.add(35);
		System.out.println(numbers.size()); // 3
		System.out.println(numbers.get(1)); // 75
		System.out.println(numbers.get(2)); // 35

		numbers.set(1, 100);
		System.out.println(numbers.size()); // 3
		System.out.println(numbers.get(1)); // 100
		System.out.println(numbers.get(2)); // 35

		numbers.add(1, 200);
		System.out.println(numbers.size()); // 4
		System.out.println(numbers.get(1)); // 200
		System.out.println(numbers.get(2)); // 100

		numbers.remove(2);// remove by index
		System.out.println(numbers.size()); // 3
		System.out.println(numbers.get(1)); // 200
		System.out.println(numbers.get(2)); // 35

		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();

			System.out.print(integer + " ");
		}

		System.out.println();

		for (int i = 0; i < numbers.size(); i++) {
			Integer integer = numbers.get(i);

			System.out.print(integer + " ");
		}

		System.out.println();

		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}

		System.out.println();
		System.out.println(numbers.size()); // 3

		List<Integer> subNumbers = new ArrayList<>();

		subNumbers.add(-67);
		subNumbers.add(99);
		subNumbers.add(876);
		subNumbers.add(345);

		System.out.println();
		System.out.println(subNumbers.size()); // 4
		System.out.println(subNumbers.isEmpty()); // false

		for (Integer integer : subNumbers) {
			System.out.print(integer + " ");
		}

		numbers.addAll(subNumbers);

		System.out.println();
		System.out.println(numbers.size()); // 7

		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}

		System.out.println();

		Collections.sort(numbers);

		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}

		System.out.println();
		System.out.println(numbers.size()); // 3
		System.out.println(numbers.isEmpty()); // false

		numbers.clear();
		System.out.println(numbers.size()); // 0
		System.out.println(numbers.isEmpty()); // true

		for (Integer integer : numbers) { // Nothing will be printed as List is empty
			System.out.print(integer + " ");
		}
	}
}
