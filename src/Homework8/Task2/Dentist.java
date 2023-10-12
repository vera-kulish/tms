package Homework8.Task2;

public class Dentist implements Doctor {

    String name;
    int experience;

    public void treat(Patient patient) {
        System.out.println("The patient " + patient.name + " has lost a tooth");
        patient.changeBalance('-', 700);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Occupation: Dentist");
        System.out.println("Experience: " + experience + " years");
    }
}