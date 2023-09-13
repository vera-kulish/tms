package Homework2;

//При помощи цикла for вывести на экран нечетные числа от 1 до
//99.  При решении используйте операцию инкремента (++).

public class Task6 {

    public static void main(String[] args) {

        // Option 1 - check each number if it's odd or even

        for(int i = 1; i < 100; i++) {
            // check if the number is odd
            if (i % 2 == 1)
                System.out.println(i);
        }

        //Option 2 - increase i by 2 on each iteration

        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
        }
    }
}
