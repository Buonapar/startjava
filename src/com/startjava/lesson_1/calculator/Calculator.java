package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int argOne = 10;
		int argTwo = 0;
		int result = 0;
		char operation = '^';
		if (operation == '+') {
			result = argOne + argTwo;
		} else if (operation == '-') {
			result = argOne - argTwo;
		} else if (operation == '*') {
			result = argOne * argTwo;
		} else if (operation == '/') {
			result = argOne / argTwo;
		} else if (operation == '^') {
			result = 1;
			for (int i = 1; i <= argTwo; i++) {
				result *= argOne;
			}
		} else if (operation == '%') {
			result = argOne % argTwo;
		}
		System.out.println(argOne + " " + operation + " " + argTwo + " = " + result);
	}
}