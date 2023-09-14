package Homework4;

//Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
//B(Black) или W(White). Результат работы программы:
//
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W

public class Task2 {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];

        // color each array item by seeing if the index on each dimension is odd or even and display the array
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) // i is even, j is even
                    chessBoard[i][j] = "W";
                else if (i % 2 == 0) // i is even, j is odd
                    chessBoard[i][j] = "B";
                else if (j % 2 == 0) // i is odd, j is even
                    chessBoard[i][j] = "B";
                else // i is odd, j is odd
                    chessBoard[i][j] = "W";
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }

    }
}
