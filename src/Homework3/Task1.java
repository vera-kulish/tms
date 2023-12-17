package Homework3;

//Создайте массив целых чисел. Напишете программу, которая
//выводит сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,0};

        int searchNumber;

        // read the input
        System.out.println("\nPlease, enter an integer number: ");
        try {
            searchNumber = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        // flag to see if the number is in the array
        boolean isInTheArray = false;

        // go through the array to see if the number from the input is present in the array
        for (int i : array) {
            if (i == searchNumber) {
                System.out.println(searchNumber + " is in the array");
                isInTheArray = true;
                break;
            }
        }

        // if the number is not present in the array
        if (!isInTheArray)
            System.out.println(searchNumber + " is not in the array");


    }
}
