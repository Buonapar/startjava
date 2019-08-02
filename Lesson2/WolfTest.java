public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.nickname = "Белый клык";
		System.out.println("Кличка волка: " + wolf.nickname);

		wolf.isMale = true;
		System.out.println(wolf.isMale ? "Пол волка: самец" : "Пол волка: самка");

		wolf.weight = 45.7f;
		System.out.println("Вес волка: " + wolf.weight);

		wolf.age = 12;
		System.out.println("Возраст волка: " + wolf.age);

		wolf.color = "дымчатый белый";
		System.out.println("Окрас волка: " + wolf.color);

		wolf.go();
		wolf.sit();
		wolf.howl();
		wolf.hunt();
	}
}