package Homework2;

//Вывести 10 первых чисел последовательности 0, -5,-10,-15..

public class Task10 {

    public static void main(String[] args) {

        for (int i = 0, j = -5; i < 10; i++, j -= 5) {
            System.out.println(j);
        }
    }
}
