package Homework10;

//Найти слово, в котором число различных символов минимально.
// Слово может содержать буквы и цифры.
// Если таких слов несколько, найти первое из них.
// Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".

public class Task3 {

    public static void main(String[] args) {

        String string = "lklk iiii opfpof njkbnjk qwertyuiop ppp";
        System.out.println(string);
        String[] words = string.split(" ");
        int differentSymbols[] = new int[words.length];

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                if(!words[i].substring(0,j).contains(String.valueOf(words[i].charAt(j)))) //if current char is not present in the substring before it
                    differentSymbols[i]++; // then add 1 to a number of different symbols in this word
            }
            System.out.print(differentSymbols[i] + " ");
        }
        System.out.println();

        //find the smallest
        int smallestNumber = differentSymbols[0];
        int smallestIndex = 0;
        for(int i = 0; i < differentSymbols.length; i++)
            if (differentSymbols[i] < smallestNumber) {
                smallestNumber = differentSymbols[i];
                smallestIndex = i;
            }

        System.out.println("Result: " + words[smallestIndex]);


    }
}
