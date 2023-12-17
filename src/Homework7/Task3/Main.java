package Homework7.Task3;

import java.util.Date;

//Для имитации работы системы создайте класс Main, который будет
//содержать только один метод public static void main
//В этом методе напишите код для создания каждого из типов
//документов, добавления их в регистр и вывода информации о
//документе;

public class Main {

    public static void main (String[] args) {

        DeliveryContract deliveryContract = new DeliveryContract(1, new Date(), "Apples", 100);
        EmployeeContract employeeContract = new EmployeeContract(2, new Date(), new Date(1759881600000L), "Vasya Pupkin");
        Invoice invoice = new Invoice(3, new Date(), 10000, "ABC123");

        Register register = new Register();
        register.saveToTheRegister(deliveryContract);
        register.saveToTheRegister(employeeContract);
        register.saveToTheRegister(invoice);
        register.displayInfo();

    }
}
