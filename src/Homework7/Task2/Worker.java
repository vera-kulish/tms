package Homework7.Task2;

public class Worker implements PrintOccupation {

    String fullName;
    int age;

    Worker(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public void printOccupation() {
        System.out.println("Worker");
    }
}