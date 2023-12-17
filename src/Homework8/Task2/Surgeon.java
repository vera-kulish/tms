package Homework8.Task2;

public class Surgeon implements Doctor {

    String name;
    int experience;

    public void treat(Patient patient) {
        System.out.println("The patient " + patient.name + " got a surgery");
        patient.changeBalance(Operation.SUBSTRACT, 500);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Occupation: Surgeon");
        System.out.println("Experience: " + experience + " years");
    }
}
