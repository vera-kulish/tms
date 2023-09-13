package Homework3;

//Создайте массив строк. Заполните его произвольными именами
//людей. Отсортируйте массив. Результат выведите на консоль.

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        String[] names = {"John", "Alex", "Martha", "Andrew", "Kate", "Chris", "Thomas", "Patrick"};
        System.out.println(Arrays.toString(names));

        String temp;
        for(int i = 0; i < names.length - 1; i++)
            for(int j = i + 1; j < names.length; j++)
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(names));
    }
}
