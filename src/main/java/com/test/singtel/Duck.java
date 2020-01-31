package com.test.singtel;

public class Duck extends Bird {
	
	@Override
	void says() {
		System.out.println("Quack,quack");
	}
	@Override
	void swim() {
		System.out.println("Can Swim");
	}

}
