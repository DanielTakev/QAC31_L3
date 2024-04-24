package inclass;

public class Demo {
    public static void main(String[] args) {
        Person ivan = new Person();
        Person maria = new Person();

        maria.name = "Maria Stefanova";
        ivan.name = "Ivan Ivanov";
        ivan.age = 22;
        ivan.weight = 3333;


        System.out.println(ivan.name);
        System.out.println(ivan.weight);

        System.out.println(ivan.age);

        Car audi = new Car();
        Car lada = new Car();

        audi.color = "Yellow";
        lada.color = "White";

        audi.gear = 1;

        System.out.println(audi.color);

        audi.color = "red";
        System.out.println(audi.color);


        audi.owner = maria;
        lada.owner = ivan;

        System.out.println(lada.owner.name);

        ivan.friend = maria;
        maria.friend = ivan;

        System.out.println(ivan.friend.name);
        System.out.println(maria.friend.name);

        audi.accelerate();
        audi.accelerate();
        audi.accelerate();

        System.out.println(audi.currentSpeed);

        lada.accelerate();

        System.out.println(lada.currentSpeed);

        audi.gearUp();
        audi.gearUp();
        audi.gearUp();
        audi.gearUp();
        audi.gearUp();
        audi.gearUp();
        audi.gearUp();

        System.out.println(audi.gear);

        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();
        audi.gearDown();

        System.out.println(audi.gear);

        audi.changeGear(5);
        audi.changeGear(2);
        audi.changeGear(99);

        System.out.println(audi.gear);
    }
}
