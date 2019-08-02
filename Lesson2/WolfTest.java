public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.setNickname("Белый клык");
		System.out.println("Кличка волка: " + wolf.getNickname());

		wolf.setMale(true);
		System.out.println(wolf.isMale() ? "Пол волка: самец" : "Пол волка: самка");

		wolf.setWeight(45.7f);
		System.out.println("Вес волка: " + wolf.getWeight());

		wolf.setAge(7);
		System.out.println("Возраст волка: " + wolf.getAge());

		wolf.setColor("дымчатый белый");
		System.out.println("Окрас волка: " + wolf.getColor());

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}