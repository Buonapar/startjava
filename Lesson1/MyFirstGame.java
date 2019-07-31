public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 40;
		int answer = 70;
		while (hiddenNumber != answer) {
			if (answer < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				answer++;
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				answer--;
			}
		}
		System.out.println("Ура! Вы угадали число! Компьютер загадал " + answer);
	}
}