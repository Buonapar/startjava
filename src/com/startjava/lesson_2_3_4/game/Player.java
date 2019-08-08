package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] numbers;
    private int attempt;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void resetTheListOfAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
    }

    public void resetTheNumberOfAttempts() {
        attempt = 0;
    }

    public void addAttempt() {
        attempt++;
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
}
