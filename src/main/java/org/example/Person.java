package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String birthPlace;
    String idNumber;
    boolean coffieOrTea;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,String birthPlace, String idNumber, boolean coffieOrTea) {
        this(firstName,lastName,age);
        this.birthPlace = birthPlace;
        this.idNumber = idNumber;
        this.coffieOrTea = coffieOrTea;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        return (getAge()<=19 && getAge()>=13);
    }
}
