package Homework2;

import java.util.Scanner;

//По введенному номеру определить цвет радуги (1 –
//красный, 4 – зеленый и т. д.).

public class Task5 {

    public static void main(String[] args) {

        int colorNumber;

        // read the input
        System.out.println("\nPlease, enter the color number: ");
        try {
            colorNumber = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        // determine which color user has entered
        switch (colorNumber) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Purple");
                break;
            //in case user has entered something not between 1 and 7
            default:
                System.out.println("This is not a color number in the rainbow");

        }
    }
}
