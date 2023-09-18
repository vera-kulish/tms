package Homework6.Task2;

public class HDD {

    String name;
    double volume;
    String type; // internal or external

    HDD() {
        this.name = "HDDdefault";
        this.volume = 256;
        this.type = "internal";
    }

    HDD(String name, double volume, String type) {
        if (type.toLowerCase().equals("internal") || type.toLowerCase().equals("external")) {
            this.name = name;
            this.volume = volume;
            this.type = type;
        }
        else
            System.out.println("Wrong HDD type");

    }

    void displayInfo() {
        System.out.println("HDD name: " + name);
        System.out.println("HDD volume: " + volume + " GB");
        System.out.println("HDD type: " + type);
    }

}
