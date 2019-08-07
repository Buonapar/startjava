package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
	private boolean isMale;
	private String nickname;
	private float weight;
	private int age;
	private String color;

	public boolean isMale() {
		return isMale;
	}

	public String getNickname() {
		return nickname;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public void setMale(boolean male) {
		isMale = male;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Волк идет");
	}

	public void sit() {
		System.out.println("Волк сидит");
	}

	public void run() {
		System.out.println("Волк бежит");
	}

	public void howl() {
		System.out.println("Волк воет");
	}

	public void hunt() {
		System.out.println("Волк охотится");
	}
}