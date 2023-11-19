package org.example;

public class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName){
        firstName = firstName;
        lastName = lastName;
    }

    public void greeting() {
        System.out.println("Hi, my name is " + this.firstName + "!");
    }

    public static void main(String[] args) {
        Person earl = new Person("Earl", "Kovacs");
        System.out.print("Here is the memory address : ");
        System.out.print(earl);
    }
}
