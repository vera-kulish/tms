package Homework4;

//Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        int[][] array3d = new int[3][3];
        Random random = new Random();
        int sum = 0;

        // initialize the array with random values and display it in the console
        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d[i].length; j++) {
                    array3d[i][j] = random.nextInt(99);
                    sum += array3d[i][j]; // calculate the sum of the elements
                    System.out.print(array3d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total sum: " + sum);

    }
}
