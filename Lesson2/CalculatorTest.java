import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.println("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            calculator.setArgOne(scanner.nextInt());

            System.out.println("Введите знак математической операции: ");
            calculator.setAction(scanner.next());

            System.out.println("Введите второе число: ");
            calculator.setArgTwo(scanner.nextInt());

            System.out.println(calculator.calculate());

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
