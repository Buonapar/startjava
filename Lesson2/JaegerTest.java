public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Romeo Blue");
		jaegerOne.setStatus("Destroyed");
		jaegerOne.setWeight(7.775f);
		jaegerOne.setSpeed(2);
		jaegerOne.move();


		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Tacit Ronin");
		jaegerTwo.setStatus("Destroyed");
		jaegerTwo.setWeight(7.450f);
		jaegerTwo.setSpeed(8);
		jaegerTwo.useVortexCannon();

		Jaeger jaegerThree = new Jaeger("Cherno Alpha", "Destroyed", 2.412f, 3);
		jaegerThree.move();
		jaegerThree.useVortexCannon();

	}
}