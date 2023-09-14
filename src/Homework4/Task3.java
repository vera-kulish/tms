package Homework4;

//. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
//Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//Ожидаемый результат: 1 2 3 1 1 1 0 0 0

public class Task3 {

    public static void main(String[] args) {

        int[][] array1 = {{1, 0, 0, 0},{0, 1, 0, 0},{0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] multipliedArrays = new int [3][3];

        // multiply the matrices
        for (int k = 0; k < multipliedArrays.length; k++)
            for (int l = 0; l < multipliedArrays[k].length; l++)
                    for (int j = 0; j < array1[l].length; j++)
                        multipliedArrays[k][l] += array1[k][j]*array2[j][l];

        // display the result of the multiplication
        for (int[] i : multipliedArrays) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }

    }
}
