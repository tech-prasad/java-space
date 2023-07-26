package com.user.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(34);
		numbers.add(23);
		numbers.add(56);
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(59);
		numbers.add(78);
		numbers.add(44);

		for (Integer a : numbers) {
			System.out.print(a + " ");
		}
		System.out.println();

		Collections.sort(numbers);

		for (Integer a : numbers) {
			System.out.print(a + " ");
		}
		System.out.println();

		Collections.reverse(numbers);

		for (Integer a : numbers) {
			System.out.print(a + " ");
		}
		System.out.println();

		int indexPresent = Collections.binarySearch(numbers, 34);
		
		System.out.println(indexPresent);
		
		int indexNotPresent = Collections.binarySearch(numbers, 99);

		System.out.println(indexNotPresent);

		Collections.shuffle(numbers);

		for (Integer a : numbers) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
