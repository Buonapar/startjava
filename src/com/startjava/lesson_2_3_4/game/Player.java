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

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void resetAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
    }

    public void addAttempt() {
        numbers[attempt] = number;
        attempt++;
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
