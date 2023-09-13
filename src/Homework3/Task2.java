package Homework3;

//Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива. Пусть число задается с консоли (класс Scanner).
//Если такого числа нет - выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int searchNumber;

        // display the initial array
        System.out.println("Initial array: ");
        for (int i : array)
            System.out.print(i + " ");

        // read the input
        System.out.println("\nPlease, enter an integer number to delete from the array: ");
        try {
            searchNumber = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        boolean isInTheArray = false;
        int[] newArray;
        int newArrayLength = array.length;

        // count how many times the number from the input is in the array and calculate new array size
        for (int i : array) {
            if (array[i] == searchNumber) {
                isInTheArray = true;
                newArrayLength--;
            }
        }

        // if the number is not present in the array
        if (!isInTheArray) {
            System.out.println(searchNumber + " is not in the array");
            return;
        }


        newArray = new int[newArrayLength];

        int j = 0; // index for the new array

        // copy all the numbers to the new array, skipping the number from the input
        for (int i : array)
            if (i != searchNumber) {
                newArray[j] = i;
                j++;
            }

        // display the new array
        System.out.println("New array after deleting the input:");
        for (int i : newArray)
            System.out.print(i + " ");


    }
}
