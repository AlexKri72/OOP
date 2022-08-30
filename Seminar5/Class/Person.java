package Seminar5.Class;

public abstract class Person {
    String name;
    String surname;
    int yearOfBirth;

    public Person(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }
}