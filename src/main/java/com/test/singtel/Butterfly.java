package com.test.singtel;

import com.test.singtelInterface.CommonFeaturesForBirdAndButterFly;

public class Butterfly extends Animal implements CommonFeaturesForBirdAndButterFly {

	public void fly() {
		System.out.println("Can Fly");
		
	}
	@Override
	public String toString(){ 
		  return "fly"+"walk";  
		 } 
}
