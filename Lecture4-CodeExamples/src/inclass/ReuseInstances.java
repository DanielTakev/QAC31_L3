package inclass;

import lesson04.Person;

public class ReuseInstances {
    public static void main(String[] args) {
        int age = 11;
        String name = "Dani";
        Person dani = PersonFactory.createPerson(age, name);
        System.out.println(dani.age);
    }
}
