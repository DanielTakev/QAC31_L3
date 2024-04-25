package lesson04;

public class CarExample {
	public static void main(String[] args) {
		Car opel = new Car("Opel", 3, "White", 111);

		String color = opel.getColor();
		System.out.println("First: " + color);

		opel.setColor("Green");
		String colorAfter = opel.getColor();
		System.out.println("Second time: " + colorAfter);
	}
}
