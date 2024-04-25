package lesson04;

public class Demo {
	public static void main(String[] args) {
		Car bmw = new Car("BMW 320", true, "Black", 200000, 360);

		Person ivan = new Person("Ivan", 54535, true);
		Person maria = new Person(22, "Maria");
		Person mariika = new Person(22, "Marii4eto");

		maria.eat();
		bmw.changeColor("Red");

		Car mercedes = new Car("Mercedes S500", true, "White", 200000, 300);
		bmw.setPrice(100000);

		boolean isBmwMoreExpensive = bmw.isMoreExpensive(mercedes);
		System.out.println("Is " + bmw.getModel() +" is more axpensive than " + mercedes.getModel() + ": " + isBmwMoreExpensive);

		bmw.calculateCarPriceForScrap(20);
		ivan.buyCar(bmw);
		bmw.changeOwner(mariika);

		ivan.cellCarForScrap();
		Car volvo = new Car("Volvo");
		Car vw = new Car("VW");

		System.out.println("compareCarFirstLetter: " + Car.compareCarFirstLetter(volvo, vw));
	}
}
