package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.println("Введите математическое выражение: ");
            Scanner scanner = new Scanner(System.in);
            calculator.parseExpression(scanner.nextLine());
            System.out.println(calculator.calculate());

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
