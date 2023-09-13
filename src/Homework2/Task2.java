package Homework2;

import java.util.Scanner;

//Написать программу для вывода названия поры года по
//номеру месяца. При решении используйте оператор if-else-if.

public class Task2 {

    public static void main(String[] args) {

        int month;

        // read the input
        System.out.println("\nPlease, enter the month number: ");
        try {
            month = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        // determine which season is it
        if ((month >= 1 && month <= 2) || month == 12)
            System.out.println("This is winter!");
        else if (month >= 3 && month <= 5)
            System.out.println("This is spring!");
        else if (month >= 6 && month <= 8)
            System.out.println("This is summer!");
        else if (month >= 9 && month <= 11)
            System.out.println("This is fall (autumn if you're British)!");
        // in case user has entered a number not between 1 and 12
        else
            System.out.println("This is not a valid month number");

    }
}
