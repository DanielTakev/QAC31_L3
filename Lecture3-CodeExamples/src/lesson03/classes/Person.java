package lesson03.classes;

public class Person {

	protected String name;
	private int age;
	private long personalID;
	private boolean isMale;
	private double weight;
	private String address;
	private Person friend;
	private double drunkLiters;

	void daiImeNaPersonObektaMi(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void eat() {
		System.out.println(name + " is eating...");
		weight++;
	}

	double getWeight() {
		return this.weight;
	}

	void walk() {
		System.out.println("Walking...");
	}
	
	void growUp() {
		System.out.println("Growing with one year");
		age++;
	}
	
	void drinkWater(double liters) {
		if(liters < 1) {
			System.out.println(name + " is drinking " + liters + " water");
			drunkLiters += liters;
			//drunkLiters = drunkLiters + liters;
		} else {
			System.out.println("That's too much water to drink");
		}
	}
}
