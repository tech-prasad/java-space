package com.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassTest {

	public static void main(String[] args) {

		Student s = new Student();

		Class<? extends Student> sClass = s.getClass();

		System.out.println(sClass.getCanonicalName());
		System.out.println(sClass.getName());
		System.out.println(sClass.getPackageName());
		System.out.println(sClass.getSimpleName());

		Field[] declaredFields = sClass.getDeclaredFields();

		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}

		Method[] declaredMethods = sClass.getDeclaredMethods();

		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}

	}

}
