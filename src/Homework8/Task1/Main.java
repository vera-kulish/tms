package Homework8.Task1;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+375441234567", "Xiaomi 13T Pro", 200);
        Phone phone2 = new Phone("+3752998765432", "Apple iPhone 15", 250);
        Phone phone3 = new Phone("+3752576543210", "Samsung Galaxy Z Flip5", 310);

        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        phone1.receiveCall("Mom");
        phone2.receiveCall("Dad");
        phone3.receiveCall("John");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.receiveCall("Steve", "+3754478945612");

        phone2.sendMessage("12312312", "45645645", "67867878");
    }
}
