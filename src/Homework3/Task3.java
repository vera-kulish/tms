package Homework3;

//Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение. Для генерации случайного
//числа используйте метод Math.random(). Пусть будет возможность создавать
//массив произвольного размера. Пусть размер массива вводится с консоли.

import java.util.Scanner;

public class Task3 {

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
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }

        // display the array
        for (int i : array)
            System.out.print(i + " ");

        int max, min;
        double sum = 0;

        // set initial values as first array item to compare after
        max = array[0];
        min = array[0];

        // find the max and the min by comparing each number with the last biggest/smallest number
        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;

            // at the same time find the sum of all numbers to later find the average
            sum += i;
        }

        // display the max and the min
        System.out.println("\nMaximum is " + max);
        System.out.println("Minimum is " + min);

        // find the average of all numbers in the array
        double avg = sum / length;
        System.out.println("Average is " + avg);

    }
}
