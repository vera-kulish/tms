package Homework6.Task1;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки:
//1. Положите деньги на первые две карточки и снимите с третьей.
//2. Выведите на экран текущее состояние всех трех карточек.

public class Main {

    public static void main (String[] args) {

        CreditCard account1 = new CreditCard("11223344", 10000);
        CreditCard account2 = new CreditCard("99887766", 250000);
        CreditCard account3 = new CreditCard("09876543", 300);

        account1.deposit(200);
        account2.deposit(1000);
        account3.withdraw(50);

        account1.displayInfo();
        account2.displayInfo();
        account3.displayInfo();
    }
}
