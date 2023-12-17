package Homework7.Task1;

//Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и
//подсчет периметра. Создать массив из 5 фигур. Вывести на экран
//сумму периметра всех фигур в массиве.

public class Main {

    public static void main (String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(5, 6, 7);
        try {
            shapes[1] = new Rectangle(5, 5, 10, 10);
            shapes[2] = new Rectangle(43, 54, 43, 54);
        } catch (IncorrectInputException e) {
            System.out.println(e);
        }
        shapes[3] = new Circle(13);
        shapes[4] = new Circle(23);

        int perimeterSum = 0;
        for (Shape i : shapes) {
            perimeterSum += i.perimeter();
        }

        System.out.println(perimeterSum);
    }
}
