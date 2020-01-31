package com.test.singtel;

import com.test.singtelInterface.CommonFeatures;
import com.test.singtelInterface.CommonFeaturesForBirdAndButterFly;

public class Bird extends Animal implements CommonFeatures,CommonFeaturesForBirdAndButterFly{
	public void fly() {
		System.out.println(" I am Flying");
	}
	public void sing() {
		System.out.println("I am Singing");
	}
	void says() {
		System.out.println("I can say");
	}
	public void swim() {
		System.out.println(" I Can Swim");
	}
	
	@Override
	public String toString(){ 
		  return "fly"+"sing"+"says"+"swim";  
		 } 
}
