package com.test.singtel;

import com.test.singtelInterface.CommonFeatures;

public class Dolphin extends Animal implements CommonFeatures {

	public void swim() {
		System.out.println("Can Swim");
		
	}

	public void sing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString(){ 
		  return "swim";  
		 } 
}
