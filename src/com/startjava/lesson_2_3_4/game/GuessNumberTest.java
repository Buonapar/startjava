package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        Player playerOne = new Player(scanner.next());
        System.out.println("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanner.next());
        String answer;

        do {
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
