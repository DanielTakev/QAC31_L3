package lesson03.classes;

import java.util.Scanner;

public class CarDemo {
	public static void main(String[] args) {
		Car bmw = new Car();
		Car golf;
		golf = new Car();
		
		golf.model = "VW Golf 1";
		golf.maxSpeed = 200;
		golf.color = "Blue";
		golf.gear = 1; // Not good practice
		golf.currentSpeed = 0;
		
		Person danielTakev = new Person();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Give name to danielTakev: ");

		String nameFromScannerInput = myScanner.nextLine();
		System.out.println("NAME IS: " + nameFromScannerInput);

		danielTakev.daiImeNaPersonObektaMi(nameFromScannerInput);

		danielTakev.setAge(23);
		
		golf.owner = danielTakev;
		
		Person ivan = new Person();
		ivan.daiImeNaPersonObektaMi("Ivan");
		golf.owner = danielTakev;
		System.out.println("The owner of the golf is " + golf.owner.name);

		System.out.println("Max speed of " + golf.model + " is " + golf.maxSpeed);
		bmw.maxSpeed = 300;

		if (bmw.maxSpeed > golf.maxSpeed) {
			System.out.println("The BMW is faster");
		} else {
			System.out.println("The VW is faster");
		}
	}
}
