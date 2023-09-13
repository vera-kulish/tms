package Homework3;

//Реализуйте алгоритм сортировки пузырьком.

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int[] arrayToSort;
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

        arrayToSort = new int[length];

        // fill the array with random numbers
        for (int i = 0; i < arrayToSort.length; i++)
            arrayToSort[i] = (int) (Math.random() * 100);

        // display the array
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arrayToSort));

        // sort the array
        int temp;
        for(int i = 0; i < length - 1; i++)
            for(int j = i + 1; j < length; j++)
                if(arrayToSort[i] > arrayToSort[j]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }

        //display the sorted array
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arrayToSort));
    }
}
