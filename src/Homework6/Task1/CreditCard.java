package Homework6.Task1;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки:
//1. Положите деньги на первые две карточки и снимите с третьей.
//2. Выведите на экран текущее состояние всех трех карточек.

public class CreditCard {

    String accountNumber;
    double balance;

    CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    CreditCard() {
        this.accountNumber = "Undefined";
        this.balance = 0;
    }

    // положить деньги на счет
    void deposit (double amount) {
        this.balance += amount;
    }

    // снять деньги со счета
    void withdraw (double amount) {
        if (amount <= this.balance)
            this.balance -= amount;
        else
            System.out.println("Not enough balance");
    }

    // вывести информацию о счете в консоль
    void displayInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: $" + balance);
    }




}
