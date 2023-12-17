package Homework7.Task2;

public class Director implements PrintOccupation {

    String fullName;
    int age;

    Director(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public void printOccupation() {
        System.out.println("Director");
    }
}
