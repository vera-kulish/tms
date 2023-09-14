package Homework4;

//Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

import java.util.Random;

public class Task6 {

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

        // sort the rows in the array
        int temp;
        for (int k = 0; k < array2d.length; k++)
            for(int i = 0; i < array2d[k].length - 1; i++)
                for(int j = i + 1; j < array2d[k].length; j++)
                    if(array2d[k][i] > array2d[k][j]) {
                        temp = array2d[k][i];
                        array2d[k][i] = array2d[k][j];
                        array2d[k][j] = temp;
                    }

        // display the array after sorting
        System.out.println("\nAfter sorting: ");
        for (int[] i : array2d) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
