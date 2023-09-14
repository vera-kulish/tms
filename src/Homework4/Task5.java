package Homework4;

//Создайте двумерный массив. Выведите на консоль диагонали массива.

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        int[][] array2d = new int[5][5];
        Random random = new Random();

        // initialize the array with random values and display it in the console
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = random.nextInt(99);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        //display main diagonal
        System.out.println("Main diagonal: ");
        for (int i = 0; i < array2d.length; i++)
            for (int j = 0; j < array2d[i].length; j++)
                if (i == j) // main diagonal is the numbers with the same row and column number
                    System.out.print(array2d[i][j] + " ");
        System.out.println();

        //display anti diagonal
        System.out.println("Anti diagonal: ");
        for (int i = 0; i < array2d.length; i++)
            for (int j = 0; j < array2d[i].length; j++)
                if (i == array2d[i].length - j - 1) // antidiagonal is the numbers where the column equals the length minus row minus 1
                    System.out.print(array2d[i][j] + " ");

    }
}
