package Homework3;

// Создайте массив и заполните массив. Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
//экран на отдельной строке.

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int[] array;
        int length;

        // read the input
        System.out.println("\nPlease, enter the array length: ");
        try {
            length = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        array = new int[length];

        // fill the array with random numbers
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random()*100);

        // display the array
        System.out.println(Arrays.toString(array));

        // replace each array item with odd index to 0
        for (int i = 1; i < array.length; i+=2)
            array[i] = 0;

        // display the array
        System.out.println(Arrays.toString(array));

    }
}
