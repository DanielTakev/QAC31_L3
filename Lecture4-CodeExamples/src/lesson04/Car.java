package lesson04;

import java.util.Objects;

public class Car {

	private String model;
	private double maxSpeed;
	private double currentSpeed;
	private String color;
	private int gear;
	private Person owner;
	private double price;
	private boolean isSportCar;
	
	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		this.gear = 1;
		this.currentSpeed = 12;
	}

	Car(String model, int gear, String color, double price) {
		this.gear = gear;
		this.price = price;

		if (Objects.equals(color, "White")) {
			this.color = "Red";
		} else {
			this.color = color;
		}
		this.model = model;
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed) {
		this(model, isSportCar, color);
		this.price = price;
		if(!isSportCar && maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed, double currentSpeed) {
		this(model, isSportCar, color, price, maxSpeed);
		this.currentSpeed = currentSpeed;
	}

	Car(String model) {
		this.model = model;
	}

	public boolean isSportCar() {
		return isSportCar;
	}

	public void setSportCar(boolean sportCar) {
		isSportCar = sportCar;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	boolean isMoreExpensive(Car carToCompare) {
        // Simplify
        return this.price > carToCompare.price;
	}

	static String compareCarFirstLetter(Car firstCar, Car secondCar) {
		char firstCarChar = firstCar.getModel().charAt(0);
		char secondCarChar = secondCar.getModel().charAt(0);
		if(firstCarChar < secondCarChar) {
			return firstCar.getModel();
		} else {
			return secondCar.getModel();
		}
	}
	
	void changeOwner(Person newOwner) {
		owner = newOwner;
		newOwner.car = this;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (isSportCar) {
			coef += 0.05;
		}
		if (color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White")) {
			coef += 0.05;
		}
		
		return coef * metalPrice;
	}
	
	void accelerate() {
		currentSpeed = currentSpeed + 10;
		System.out.println(currentSpeed);
	}
	
	void changeGearUp() {
		if(gear == 5) {
			System.out.println("Tha max gear is 5.");
		} else {
			gear++;
			System.out.println("Current gear is " + gear);
		}
	}
	
	void changeGearDown() {
		if(gear == 1) {
			System.out.println("Tha min gear is 1.");
		} else {
			gear--;
			System.out.println("Current gear is " + gear);
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear < 1 || nextGear > 5) {
			System.out.println("Sorry, choose gear between 1 and 5");
		} else {
			gear = nextGear;
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
		System.out.println("The new color is " + newColor);
	}
}
