package com.startjava.lesson_2_3_4.person;

public class Person {
	boolean isMale = true;
	String name = "Ivan";
	float growth = 1.90f;
	int weight = 90;
	int age = 45;

	void go() {
		System.out.println("Человек идет");
	}

	void sit() {
		System.out.println("Человек сидит");
	}

	void run() {
		System.out.println("Человек бежит");
	}

	void speak() {
		System.out.println("Человек говорит");
	}

	void learn() {
		System.out.println("Человек учит Java");
	}

}