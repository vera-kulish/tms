package Homework6Task2;

public class RAM {

    String name;
    double volume;

    RAM() {
        this.name = "RAMdefault";
        this.volume = 8;
    }

    RAM(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    void displayInfo() {
        System.out.println("RAM name: " + name);
        System.out.println("RAM volume: " + volume + " GB");
    }
}
