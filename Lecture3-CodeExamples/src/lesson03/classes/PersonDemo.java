package lesson03.classes;

public class PersonDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		Person maria = new Person();
		Person ani = new Person();
		
//		ivan.name = "Ivan";
		ivan.daiImeNaPersonObektaMi("Ivan");

		maria.eat();
		System.out.println("Maria weight: " + maria.getWeight());
		System.out.println("Ivan: " + ivan.getWeight());
		
		ivan.name = "Ivan Georgiev";
		maria.name = "Maria Ivanova";
		ivan.eat();
		maria.eat();
		ivan.eat();

		System.out.println(ivan.getWeight());

		ivan.drinkWater(1);
		ivan.drinkWater(0.7);
	}
}
