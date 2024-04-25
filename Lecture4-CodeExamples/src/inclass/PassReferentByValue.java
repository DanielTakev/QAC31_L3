package inclass;

import lesson04.Person;

public class PassReferentByValue {

    public static void main(String[] args) {
        Person ivan = new Person(17, "Ivan");
        changePersonNameToMilen(ivan);

        // YES it changes, but the reference ivan, still references the
        // initial object and did not change where it references.
        System.out.println("After invoking passMethod, ivan.name = " + ivan.name);
    }

    public static void changePersonNameToMilen(Person personParam) {
        personParam.name = "Milen";
        personParam = new Person();
    }
}
