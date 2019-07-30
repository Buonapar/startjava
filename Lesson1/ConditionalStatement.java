public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 33;
		boolean isMale = true;
		boolean isFamale = false;
		float height = 1.78f;
		char firstCharOfName = 'А';

		if (age > 20) {
			System.out.println("Твой возраст больше 20 лет");
		}

		if (isMale == true) {
			System.out.println("Ты мужчина");
		}

		if (isFamale == true) {
			System.out.println("Ты женщина");
		}

		if (height < 1.80) {
			System.out.println("Твой рост ниже 1 метра 80 сантиметров");
		} else {
			System.out.println("Твой рост выше 1 метра 80 сантиметров");
		}

		if (firstCharOfName == 'М') {
			System.out.println("Твое имя начинается с буквы М");
		} else if (firstCharOfName == 'И') {
			System.out.println("Твое имя начинается с буквы И");
		} else {
			System.out.println("Твое имя начинается с неизвестной буквы");
		}
	}
}