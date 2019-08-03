import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        boolean isWork = true;
        boolean isWorkAsk = true;
        System.out.println("Введите имя первого игрока: ");
        Scanner scannerLine = new Scanner(System.in);
        Player playerOne = new Player(scannerLine.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player playerTwo = new Player(scannerLine.nextLine());

        while (isWork) {
            GuessNumber guessNumber = new GuessNumber();
            guessNumber.play(playerOne, playerTwo);
            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                Scanner scannerString = new Scanner(System.in);
                String answer = scannerString.nextLine();
                if (answer.equals("да")) {
                    break;
                } else if (answer.equals("нет")) {
                    isWork = false;
                    break;
                }
            }

        }
    }
}