package com.control.structuresif;

public class SchoolBell {
	public void ringBell() {
		System.out.println("Ring the bell");
	}
	public static void main(String[] args) {
		SchoolBell bell = new SchoolBell();

		int time = 4;

		if (time == 4) {
			bell.ringBell();
		}
	}
}
