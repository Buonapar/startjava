public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 33;
		if (age > 20) {
			System.out.println("Твой возраст больше 20 лет");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println("Ты мужчина");
		}

		if (!isMale) {
			System.out.println("Ты женщина");
		}

		float height = 1.78f;
		if (height < 1.80) {
			System.out.println("Твой рост ниже 1 метра 80 сантиметров");
		} else {
			System.out.println("Твой рост выше 1 метра 80 сантиметров");
		}

		char firstCharOfName = 'А';
		if (firstCharOfName == 'М') {
			System.out.println("Твое имя начинается с буквы М");
		} else if (firstCharOfName == 'И') {
			System.out.println("Твое имя начинается с буквы И");
		} else {
			System.out.println("Твое имя начинается с неизвестной буквы");
		}
	}
}