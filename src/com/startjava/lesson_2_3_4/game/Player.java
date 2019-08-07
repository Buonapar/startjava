package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] numbers;
    private int attempt;

    public int getAttempt() {
        return attempt;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public Player(String name) {
        this.name = name;
        numbers = new int[10];

    }

    public void nullListNumber() {
        attempt = 0;
        Arrays.fill(numbers, 0, attempt, 0);
    }

    public void countAttempt() {
        ++attempt;
        numbers[attempt - 1] = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String toStringArrayNumbers(int[] numbers) {
        StringBuilder b = new StringBuilder();
        for(int number : numbers) {
            b.append(number);
            b.append(" ");
        }
        return b.toString();
    }
}
