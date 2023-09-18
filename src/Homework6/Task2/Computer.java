package Homework6.Task2;

public class Computer {

    double price;
    String model;
    RAM ram;
    HDD hdd;

    Computer(double price, String model) {
        this.price = price;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void displayInfo() {
        System.out.println("Price: $" + price);
        System.out.println("Model: " + model);
        ram.displayInfo();
        hdd.displayInfo();
    }



}
