package Homework8.Task2;

public class Patient {

    String name;
    char gender;
    int age;
    double balance;

    Patient(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.balance = 0;
    }

    void changeBalance(Operation operation, double amount) {
        switch(operation){
            case ADD:
                this.balance += amount;
                break;
            case SUBSTRACT:
                this.balance -= amount;
                break;
            default:
                System.out.println("Wrong operation");
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Balance: $" + balance);
    }

    void sendToTheDoctor(TreatmentPlan treatmentPlan) {
        switch(treatmentPlan){
            case ONE:
                Surgeon surgeon = new Surgeon();
                surgeon.treat(this);
                break;
            case TWO:
                Dentist dentist = new Dentist();
                dentist.treat(this);
                break;
            case THREE:
                Physician physician = new Physician();
                physician.treat(this);
            default:
                System.out.println("Wrong treatment plan");
        }
    }

}
