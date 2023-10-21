package Homework10;

//Дана строка произвольной длины с произвольными словами.
//Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
//Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
//Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов,
// а на вход программе передали число 500 и т. п. ситуации.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        String string = "word banana level palindrome clock";
        String[] words = string.split(" ");

        int index = 0;
        boolean isIntegerNumber = false;
        boolean isCorrectNumber = true;

        // read the input
        do {
            System.out.println("\nPlease, enter an integer number between 0 and " + words.length);
            try {
                index = Integer.valueOf(new Scanner(System.in).nextLine());
                if(index < 1 || index > words.length) {
                    isCorrectNumber = false;
                    continue;
                }
            } catch (Exception e) {
                // if user has entered something other than a whole number - repeat the input
                System.out.println("This is not an integer number");
                continue;
            }
            isIntegerNumber = true;
            isCorrectNumber = true;
        } while (!isIntegerNumber || !isCorrectNumber);

        StringBuffer word = new StringBuffer(words[index-1]);
        StringBuffer wordBackwards = new StringBuffer(words[index-1]).reverse();

        System.out.println(word + " " + wordBackwards);

        if(word.toString().equals(wordBackwards.toString()))
            System.out.println(words[index-1] + " is a palindrome");
        else
            System.out.println(words[index-1] + " is not a palindrome");

    }
}
