package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private boolean isWork = true;
    private Scanner scanner = new Scanner(System.in);
    private Player one;
    private Player second;

    public GuessNumber(Player one, Player second) {
        hiddenNumber = (int) (Math.random() * 101);
        this.one = one;
        this.second = second;
    }

    public void play() {
        while(isWork) {
            inputNumber(one);
            System.out.println(compareNumbers(one));

            if (!isWork) {
                break;
            }

            inputNumber(second);
            System.out.println(compareNumbers(second));
        }
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " введи число: ");
        player.setNumber(scanner.nextInt());
    }

    private String compareNumbers(Player player) {
        if (player.getNumber() < hiddenNumber) {
            return player.getName() + " введенное вами число меньше того, что загадал компьютер";
        } else if (player.getNumber() > hiddenNumber){
            return player.getName() + " введенное вами число больше того, что загадал компьютер";
        }
        isWork = false;
        return player.getName() + " вы выиграли!";
    }


}
