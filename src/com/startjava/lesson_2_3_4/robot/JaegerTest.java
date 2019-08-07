package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Romeo Blue", "Destroyed", 7.775f, 2);
		jaegerOne.move();

		Jaeger jaegerTwo = new Jaeger("Tacit Ronin", "Destroyed", 7.450f, 8);
		jaegerTwo.useVortexCannon();

		Jaeger jaegerThree = new Jaeger("Cherno Alpha", "Destroyed", 2.412f, 3);
		jaegerThree.move();
		jaegerThree.useVortexCannon();

	}
}