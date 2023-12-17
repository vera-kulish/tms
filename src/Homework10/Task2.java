package Homework10;

//Дана строка произвольной длины с произвольными словами.
//Найти самое короткое слово в строке и вывести его на экран.
//Найти самое длинное слово в строке и вывести его на экран.
//Если таких слов несколько, то вывести последнее из них.

public class Task2 {

    public static void main(String[] args) {

        String string = "erf ewfwefwe wef poklkpkosd 09ufe wedf trf sdsdas";
        System.out.println(string);
        String[] words = string.split(" ");

        //search for the shortest number
        int shortest = 0;
        for(int i = 0; i < words.length; i++)
            if(words[i].length() <= words[shortest].length())
                shortest = i;

        //search for the longest
        int longest = 0;
        for(int i = 0; i < words.length; i++)
            if(words[i].length() >= words[longest].length())
                longest = i;

        System.out.println("Shortest: " + words[shortest]);
        System.out.println("Longest: " + words[longest]);
    }
}
