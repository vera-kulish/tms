package Homework8.Task1;

//Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого класса.
// Выведите на консоль значения их  переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
// getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.

//Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//метод.
//Создать метод sendMessage с аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {

    String number;
    String model;
    float weight;

    Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    Phone() {
        this.number = "Unknown";
        this.model = "Unknown";
        this.weight = 0;
    }

    void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    void receiveCall(String name, String number) {
        System.out.println(name + " is calling");
        System.out.println(number);
    }

    String getNumber() {
        return this.number;
    }

    void sendMessage(String... numbers) {
        System.out.println("Sending messages to:");
        for (String number : numbers)
            System.out.println(number);

    }

    void displayInfo() {
        System.out.println("Phone number: " + number);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight + " g");
        System.out.println();
    }

}
