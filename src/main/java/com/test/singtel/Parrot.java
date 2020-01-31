package com.test.singtel;

import java.util.Scanner;

public class Parrot extends Bird {
	@Override
	void says() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter the parrot you want to listen\n 1 for parrot living with dogs \n 2 for parrot living with cats \n 3 for parrot living near rooster");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("Woof Woof");
			break;
		case 2:
			System.out.println("Meow");
			break;
		case 3:
			System.out.println("Cock-a-doodle-doo");
			break;
		default:
			System.out.println("No parrot available");
		}
	}

}
