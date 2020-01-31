package com.test.singtel;

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
	}

}
