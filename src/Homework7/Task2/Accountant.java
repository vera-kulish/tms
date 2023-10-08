package Homework7.Task2;

public class Accountant implements PrintOccupation {

    String fullName;
    int age;

    Accountant(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public void printOccupation() {
        System.out.println("Accountant");
    }
}