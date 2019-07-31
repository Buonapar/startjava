public class Cycle {
	public static void main(String[] args) {
		System.out.println("\nцикл for:\n");
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("\nцикл while:\n");
		int counter = 6;
		while(counter >= -6) {
			System.out.println(counter);
			counter -= 2;
		}

		counter = 10;
		int sum = 0;
		do {
			if (counter % 2 != 0) {
				sum += counter;
			}
			counter++;
		} while(counter <= 20);
		System.out.println("\nсумма всех нечетных чисел в цикле do-while: " + sum);
	}
}