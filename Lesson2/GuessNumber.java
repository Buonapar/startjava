import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private boolean isWork = true;

    public GuessNumber() {
        hiddenNumber = (int) (Math.random() * 100);
    }

    public void play(Player one, Player second) {

        while(isWork) {
            inputNumber(one);
            System.out.println(searchNumber(one));

            if (!isWork) {
                break;
            }

            inputNumber(second);
            System.out.println(searchNumber(second));
        }
    }

    private String searchNumber(Player player) {
        if (player.getNumber() < hiddenNumber) {
            return player.getName() + " введенное вами число меньше того, что загадал компьютер";
        } else if (player.getNumber() > hiddenNumber){
            return player.getName() + " введенное вами число больше того, что загадал компьютер";
        }
        isWork = false;
        return player.getName() + " вы выиграли!";
    }

    private Player inputNumber(Player player) {
        System.out.println(player.getName() + " введи число: ");
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt());
        return player;
    }

}