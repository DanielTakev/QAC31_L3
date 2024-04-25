package inclass;

import lesson04.Person;

public class PersonFactory {
    public static Person createPerson(int age, String name) {
        return new Person(age, name);
    }
}
