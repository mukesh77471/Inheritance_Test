package com.test.singtel;

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
		Bird parrot= new Parrot();
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
		
	}

}
