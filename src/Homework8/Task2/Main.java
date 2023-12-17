package Homework8.Task2;

public class Main {

    public static void main (String[] args) {

        Patient patient = new Patient("John Smith", 'm', 35);
        patient.changeBalance('+', 3000);
        patient.displayInfo();


        patient.sendToTheDoctor(TreatmentPlan.ONE);
        patient.sendToTheDoctor(TreatmentPlan.TWO);
        patient.sendToTheDoctor(TreatmentPlan.THREE);

        patient.displayInfo();
    }
}
