package Homework2;

import java.util.Scanner;

//Напишите программу, которая будет принимать на вход
//число и на выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения
//остатка от деления - операция выглядит так: '% 2').

public class Task3 {

    public static void main(String[] args) {
        int number;

        // read the input
        System.out.println("\nPlease, enter an integer number: ");
        try {
            number = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        // if the number is divisible by 2
        if (number % 2 == 0)
            System.out.println("Number " + number + " is even");
        // if the number is not divisible by 2
        else if (number % 2 == 1)
            System.out.println("Number " + number + " is odd");
        // in case of a miracle
        else
            System.out.println("How?!");

    }
}
