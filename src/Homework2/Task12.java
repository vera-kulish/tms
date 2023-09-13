package Homework2;

//Выведите на экран первые 11 членов последовательности
//Фибоначчи

public class Task12 {

    public static void main(String[] args) {

        int number1 = 0, number2 = 1, number3;

        // display the first 2 numbers of the sequence
        System.out.println(number1);
        System.out.println(number2);

        for (int i = 0; i < 9; i++) {
            // find and display the next number
            number3 = number1 + number2;
            System.out.println(number3);

            //save the last 2 numbers of the sequence
            number1 = number2;
            number2 = number3;
        }
    }
}

