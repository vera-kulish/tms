package Homework6.Task2;

public class HDD {

    String name;
    double volume;
    Type type; // internal or external

    HDD() {
        this.name = "HDDdefault";
        this.volume = 256;
        this.type = Type.INTERNAL;
    }

    HDD(String name, double volume, Type type) {
        if (type.equals(Type.INTERNAL) || type.equals(Type.EXTERNAL)) {
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
