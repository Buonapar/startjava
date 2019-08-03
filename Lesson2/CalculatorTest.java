import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean isWork = true;
        Calculator calculator = new Calculator();

        while (isWork) {
            System.out.println("Введите первое число: ");
            Scanner scannerInt = new Scanner(System.in);
            calculator.setArgOne(scannerInt.nextInt());

            System.out.println("Введите знак математической операции: ");
            Scanner scannerString = new Scanner(System.in);
            calculator.setAction(scannerString.nextLine());

            System.out.println("Введите второе число: ");
            calculator.setArgTwo(scannerInt.nextInt());

            System.out.println(calculator.operation());

            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                String answer = scannerString.nextLine();
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    isWork = false;
                    break;
                }
            }
        }
    }
}
