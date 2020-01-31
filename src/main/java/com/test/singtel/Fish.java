package com.test.singtel;

import com.test.singtelInterface.CommonFeatures;

public class Fish extends Animal implements CommonFeatures{

	public void swim() {
		System.out.println("Can Swim");
		
	}

	public void sing() {
		System.out.println("cannot sing");
		
	}
	@Override
	void walk() {
		System.out.println("cannot walk");
	}
	
	public void type(String type) {
		if(type.equals("Shark")) {
			System.out.println("Sharks are large and grey, Sharks eat other fish");
		}
		if(type.equals("Clownfish")) {
			System.out.println("Clownfish are small and colourful(orange). Clownfish make jokes");
		}
	}

}
