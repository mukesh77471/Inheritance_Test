package com.test.singtel;

import com.test.singtelInterface.CommonFeaturesForBirdAndButterFly;

public class Caterpillar extends Animal implements CommonFeaturesForBirdAndButterFly{

	public void fly() {
		System.out.println("Cannot Fly");
		
	}
	@Override
	void walk() {
		System.out.println("Can Crawl");
	}
	@Override
	public String toString(){ 
		  return "walk";  
		 } 
}
