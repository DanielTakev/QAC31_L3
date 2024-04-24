package inclass;

public class Car {
    double maxSpeed;
    double currentSpeed;
    String color;
    int gear;
    Person owner;

    void changeGear(int newGear) {
        if(newGear <= 5 && newGear >= 1) {
            gear = newGear;
        } else {
            System.out.println("INVALID GEAR!");
        }
    }
    
    void accelerate() {
        currentSpeed += 10;
    }

    void gearUp() {
        if(gear < 5) {
            gear++;
        } else {
            System.out.println("You are already on 5th gear");
        }
    }

    void gearDown() {
        if(gear > 1) {
            gear--;
        } else {
            System.out.println("You are already on 1st gear");
        }
    }
}
