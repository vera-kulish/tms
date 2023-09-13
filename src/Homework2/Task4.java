package Homework2;

import java.util.Scanner;

//Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».

public class Task4 {

    public static void main(String[] args) {

        int temperature;

        // read the input
        System.out.println("\nPlease, enter the temperature: ");
        try {
            temperature = Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            // if user has entered something other than a whole number
            System.out.println("This is not an integer number");
            return;
        }

        // determine what to display based on the temperature
        if (temperature > -5)
            System.out.println("Warm");
        else if (temperature <= -5 && temperature > -20)
            System.out.println("Normal");
        else // if temperature is <= -20
            System.out.println("Cold");


    }
}
