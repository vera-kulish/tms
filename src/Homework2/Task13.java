package Homework2;

import java.util.Scanner;

//За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и
//количество месяцев. А банк вычисляет конечную сумму вклада с учетом
//начисления процентов за каждый месяц. Для вычисления суммы с
//учетом процентов используйте цикл for. Пусть сумма вклада будет
//представлять тип float

public class Task13 {

    public static void main(String[] args) {

        float depositAmount;
        int numberOfMonths;
        int percent = 7;

        // read the input
        System.out.println("\nPlease, enter the deposit amount: ");
        try {
            depositAmount = Float.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            System.out.println("This is not a number");
            return;
        }

        // read the input
        System.out.println("\nPlease, enter the number of months: ");
        try {
            numberOfMonths = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            System.out.println("This is not an integer number");
            return;
        }

        for (int i = 0; i < numberOfMonths; i++) {
            // add the return amount for each month
            depositAmount += depositAmount * percent / 100;
        }

        System.out.println(depositAmount);



    }
}
