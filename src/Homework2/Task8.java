package Homework2;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного  пользователем числа. Для ввода числа воспользуйтесь
//классом Scanner

public class Task8 {

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

        int sumOfNumbers = 0;

        for (int i = 1; i <= number; i++) {
            // add all numbers from 1 to number
            sumOfNumbers += i;
        }

        System.out.println(sumOfNumbers);
    }
}
