package Homework2;

import java.util.Scanner;

//Написать программу для вывода названия поры года по
//номеру месяца. При решении используйте оператор switch-case.

public class Task1 {

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
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("This is winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is fall (autumn if you're British)!");
                break;
            // in case user has entered a number not between 1 and 12
            default:
                System.out.println("This is not a valid month number");
                break;



        }

    }
}
