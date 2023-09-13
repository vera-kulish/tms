package Homework3;

//Создайте массив из n случайных целых чисел и выведите его на экран.
//Размер массива пусть задается с консоли и размер массива может быть больше 5 и
//меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об
//этом. Если пользователь ввёл не подходящее число, то программа должна просить
//пользователя повторить ввод. Создайте второй массив только из чётных элементов
//первого массива, если они там есть, и вывести его на экран.

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        boolean correctLength;
        int arrayLength = 0;

        // read the input until user inputs the correct number (between 6 and 10)
        do {
            System.out.println("\nPlease, enter the array length between 6 and 10: ");
            try {
                arrayLength = Integer.valueOf(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                // if user has entered something other than a whole number
                System.out.println("This is not an integer number");
                correctLength = false;
                continue;
            }
            // if  user inputs the number outside the range 6-10
            if (arrayLength <= 5 || arrayLength > 10) {
                System.out.println("Incorrect length");
                correctLength = false;
                continue; // skip the rest of the iteration and go again
            }
            correctLength = true; // set the flag to exit the cycle
        } while (!correctLength);

        // initialize the array and fill with random numbers
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            array[i] = (int) (Math.random() * 100);

        // display the array
        System.out.println("Initial array:");
        for (int i : array)
            System.out.print(i + " ");

        // find how many even numbers are in the array to know the length of the new array
        int evenNumbersInTheArray = 0;
        for (int i : array) {
            if (i % 2 == 0)
                evenNumbersInTheArray++;
        }

        // create the new array and copy only even numbers to it
        int[] arrayWithEvenNumbers = new int[evenNumbersInTheArray];
        int j = 0;
        for (int i : array)
            if (i % 2 == 0) {
                arrayWithEvenNumbers[j] = i;
                j++;
            }

        // display the new array
        System.out.println("\nNew array with even numbers: ");
        for (int i : arrayWithEvenNumbers)
            System.out.print(i + " ");


    }

}
