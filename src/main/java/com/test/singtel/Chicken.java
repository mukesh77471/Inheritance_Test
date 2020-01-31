package com.test.singtel;

public class Chicken extends Bird{
	
	@Override
	void says() {
		System.out.println("Cluck, cluck");
	}
	@Override
	public void fly() {
		System.out.println("Cannot Fly wings clipped");
	}
	@Override
	public String toString(){ 
		  return "says";  
		 } 
}
