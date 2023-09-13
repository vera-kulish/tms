package Homework3;

//Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
//отдельных строках. Посчитайте среднее арифметическое элементов каждого
//массива и сообщите, для какого из массивов это значение оказалось больше
//(либо сообщите, что их средние арифметические равны)

public class Task4 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // fill the arrays with random numbers
        for (int i = 0; i < array1.length; i++)
            array1[i] = (int) (Math.random() * 100);
        for (int i = 0; i < array2.length; i++)
            array2[i] = (int) (Math.random() * 100);

        // display array1
        for (int i : array1)
            System.out.print(i + " ");
        System.out.println();

        // display array2
        for (int i : array2)
            System.out.print(i + " ");
        System.out.println();

        // calculate the sum of the numbers in each array
        double sum1 = 0, sum2 = 0;
        for (int i : array1)
            sum1 += i;
        for (int i : array2)
            sum2 += i;

        // calculate and display average for each array
        double average1 = sum1 / array1.length;
        double average2 = sum2 / array2.length;
        System.out.println("Average value of array1 = " + average1);
        System.out.println("Average value of array2 = " + average2);

        //compare the averages of both arrays
        if (average1 > average2)
            System.out.println("Average value for array1 is bigger than average value for array2");
        else if (average2 > average1)
            System.out.println("Average value for array2 is bigger than average value for array1");
        else
            System.out.println("Average values for both arrays are the same");
    }
}
