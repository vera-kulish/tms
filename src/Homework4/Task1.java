package Homework4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {

        int[][][] array3d = new int[3][3][3];
        Random random = new Random();

        // initialize the array with random values and display it in the console
        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d[i].length; j++) {
                for (int k = 0; k < array3d[i][j].length; k++) {
                    array3d[i][j][k] = random.nextInt(99);
                    System.out.print(array3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int increase = 0;
        boolean isIntegerNumber;
        // read the input
        do {
            System.out.println("\nPlease, enter an integer number: ");
            try {
                increase = Integer.valueOf(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                // if user has entered something other than a whole number - repeat the input
                System.out.println("This is not an integer number");
                isIntegerNumber = false;
                continue;
            }
            isIntegerNumber = true;
        } while (!isIntegerNumber);

        // increase each number in the array and display the updated array
        System.out.println("Updated array:");

        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d[i].length; j++) {
                for (int k = 0; k < array3d[i][j].length; k++) {
                    array3d[i][j][k] += increase;
                    System.out.print(array3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
