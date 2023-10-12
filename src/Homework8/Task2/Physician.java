package Homework8.Task2;

public class Physician implements Doctor {

    String name;
    int experience;

    public void treat(Patient patient) {
        System.out.println("The patient " + patient.name + " got a prescription");
        patient.changeBalance('-', 100);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Occupation: Physician");
        System.out.println("Experience: " + experience + " years");
    }
}