package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private boolean isWin = true;
    private Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerSecond;
    private int maxAttempt;

    public GuessNumber(Player playerOne, Player playerSecond) {
        hiddenNumber = (int) (Math.random() * 101);
        this.playerOne = playerOne;
        this.playerSecond = playerSecond;
        maxAttempt = 10;
    }

    public void play() {
        playerOne.resetAttempts();
        playerOne.setAttempt(0);
        playerSecond.resetAttempts();
        playerSecond.setAttempt(0);

        System.out.println("У вас 10 попыток");
        while(isWin) {
            inputNumber(playerOne);
            System.out.println(compareNumbers(playerOne));
            if (!isWin) {
                break;
            }
            inputNumber(playerSecond);
            System.out.println(compareNumbers(playerSecond));
            if (playerSecond.getAttempt() > maxAttempt) {
                isWin = false;
            }
        }
        typingArray(playerOne);
        typingArray(playerSecond);
    }

    private void inputNumber(Player player) {
            System.out.println(player.getName() + " введи число: ");
            player.setNumber(scanner.nextInt());
            player.addAttempt();
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
        isWin = false;
        return "Игрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (player.getAttempt()) + " попытки";
    }

    private void typingArray(Player player){
        System.out.print("Игрок " + player.getName() + " вводил числа: ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }


}
