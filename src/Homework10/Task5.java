package Homework10;

//Дана произвольная строка.
//Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки. Например, "Hello" -> "HHeelllloo".

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        char[] newString = new char[string.length()*2];

        for(int i = 0; i < string.length(); i++) {
            newString[i*2] = string.charAt(i);
            newString[i*2 + 1] = string.charAt(i);
        }

        System.out.println(newString);
    }
}
