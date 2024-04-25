package inclass;

import lesson04.Person;

public class References {
    public static void main(String[] args) {
//        Person mitko;
////        System.out.println(mitko);
//        Person joro = new Person(18,"Georgi");
//        mitko = joro;
//        /*
//            When you modify mitko.age, you're actually modifying the same object referenced by joro
//        */
//        mitko.age = 21;
//        System.out.println("Joro's age: " + joro.age);
//        System.out.println("Mitko's age: " + mitko.age);
//         Person mitko = new Person(joro.age, joro.name); // Create a new Person object with the same age and name as joro


        Person joro = new Person(18,"Georgi");
        Person mitko = new Person(20,"Dimitar");
        joro.age = mitko.age;
        System.out.println(joro.name);
    }
}
