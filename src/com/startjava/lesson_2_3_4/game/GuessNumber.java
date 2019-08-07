package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private boolean isWin = true;
    private Scanner scanner = new Scanner(System.in);
    private Player one;
    private Player second;
    private int maxAttempt;

    public GuessNumber(Player one, Player second) {
        hiddenNumber = (int) (Math.random() * 101);
        this.one = one;
        this.second = second;
        maxAttempt = one.getNumbers().length;
    }

    public void play() {
        one.nullListNumber();
        second.nullListNumber();

        System.out.println("У вас 10 попыток");
        while(isWin) {
            inputNumber(one);
            System.out.println(compareNumbers(one));
            if (!isWin) {
                break;
            }
            inputNumber(second);
            System.out.println(compareNumbers(second));
            if (second.getAttempt() > maxAttempt) {
                winner();
            }
        }
    }

    private void inputNumber(Player player) {
            System.out.println(player.getName() + " введи число: ");
            player.setNumber(scanner.nextInt());
            player.countAttempt();
    }

    private String compareNumbers(Player player) {
        if (player.getAttempt() >= maxAttempt){
            return "у " + player.getName() + " закончились попытки";
        }
        if (player.getNumber() < hiddenNumber) {
            return player.getName() + " введенное вами число меньше того, что загадал компьютер";
        } else if (player.getNumber() > hiddenNumber){
            return player.getName() + " введенное вами число больше того, что загадал компьютер";
        }
        winner();
        return "Игрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (player.getAttempt()) + " попытки";
    }

    private void winner() {
        isWin = false;
        typingArray(one);
        typingArray(second);
    }

    private void typingArray(Player player){
        int[] arrayNumbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());
        System.out.println("Игрок " + player.getName() + " вводил числа: " + player.toStringArrayNumbers(arrayNumbers));
    }

}
