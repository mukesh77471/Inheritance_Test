package com.test.singtel;

import java.util.ArrayList;

import com.test.singtelInterface.CommonFeaturesForBirdAndButterFly;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		Bird duck = new Duck();
		duck.says();
		Bird chicken = new Chicken();
		chicken.says();
		chicken.fly();
		Chicken rooster = new Rooster();
		rooster.says();
		Bird parrot = new Parrot();
		parrot.says();

		Fish fish = new Fish();
		fish.sing();
		fish.walk();
		fish.swim();
		fish.type("Shark");
		fish.type("Clownfish");
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		caterpillar.walk();

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Dolphin(), new Butterfly(), new Caterpillar() };
		
		int count =0;
		ArrayList<Animal> fly = new ArrayList<Animal>();
		ArrayList<Animal> walk = new ArrayList<Animal>();
		ArrayList<Animal> sing = new ArrayList<Animal>();
		ArrayList<Animal> swim = new ArrayList<Animal>();
		for(Animal animal : animals)
		{
			
			if(animal.toString().contains("fly")) {
				fly.add(animal);
			}
			if(animal.toString().contains("walk")) {
				walk.add(animal);
			}
			if(animal.toString().contains("swim")) {
				swim.add(animal);
			}
			if(animal.toString().contains("sing")) {
				sing.add(animal);
			}
		}
		
		System.out.println("Fly :" +fly.size());
		System.out.println("Walk :" +walk.size());
		System.out.println("swim :" +swim.size());
		System.out.println("sing :" +sing.size());
	}

}
