package Homework6.Task3;

//Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя
//свойствами: количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат.
//Сделать функцию, снимающую деньги, которая принимает сумму денег, а
//возвращает булевое значение - успешность выполнения операции.
//При снятии денег функция должна распечатывать каким количеством
//купюр какого номинала выдаётся сумма.
//Создать конструктор с тремя параметрами - количеством купюр каждого
//номинала.

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {


        ATM atm = new ATM(5,5, 5);
        int amount;
        int action = 0;
        int a20 = 0;
        int a50 = 0;
        int a100 = 0;
        boolean wrongValue;

        do {
            System.out.println("\n1 - Withdraw cash");        // display the menu
            System.out.println("2 - Add cash");
            System.out.println("0 - Exit");

            System.out.println("\nChoose the action: ");
            try {
                action = Integer.valueOf(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                // if user has entered something other than a whole number - repeat the input
                System.out.println("Incorrect value");
                continue;
            }

            switch (action) {
                case 0:
                    return; //exit
                case 1:
                    //read the amount to withdraw
                    System.out.println("\nPlease, enter the amount (enter 0 to exit): ");
                    try {
                        amount = Integer.valueOf(new Scanner(System.in).nextLine());
                    } catch (Exception e) {
                        // if user has entered something other than a whole number - repeat the input
                        System.out.println("Incorrect value");
                        continue;
                    }
                    atm.withdraw(amount);
                break;
                case 2:
                    do {
                        // read the amount to add
                        System.out.println("\nPlease, enter the amount of 100s to deposit: ");
                        try {
                            a100 = Integer.valueOf(new Scanner(System.in).nextLine());
                        } catch (Exception e) {
                            // if user has entered something other than a whole number - repeat the input
                            System.out.println("Incorrect value");
                            wrongValue = true;
                            continue;
                        }
                        wrongValue = false;
                    } while(wrongValue == true);

                    do {
                        System.out.println("\nPlease, enter the amount of 50s to deposit: ");
                        try {
                            a50 = Integer.valueOf(new Scanner(System.in).nextLine());
                        } catch (Exception e) {
                            // if user has entered something other than a whole number - repeat the input
                            System.out.println("Incorrect value");
                            wrongValue = true;
                            continue;
                        }
                        wrongValue = false;
                    } while(wrongValue == true);

                    do {
                        System.out.println("\nPlease, enter the amount of 20s to deposit: ");
                        try {
                            a20 = Integer.valueOf(new Scanner(System.in).nextLine());
                        } catch (Exception e) {
                            // if user has entered something other than a whole number - repeat the input
                            System.out.println("Incorrect value");
                            wrongValue = true;
                            continue;
                        }
                        wrongValue = false;
                    } while(wrongValue == true);

                    atm.addCash(a20, a50, a100);
                break;
                default:
                    System.out.println("Incorrect value");
            }
        } while (action != 0);
    }
}
