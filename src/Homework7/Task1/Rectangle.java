package Homework7.Task1;

public class Rectangle extends Shape {

    Rectangle(int side1, int side2, int side3, int side4) {
        this.sideLengths = new int[4];
        this.sideLengths[0] = side1;
        this.sideLengths[1] = side2;
        this.sideLengths[2] = side3;
        this.sideLengths[3] = side4;
    }

    double area() {
        return sideLengths[0] * sideLengths[1];
    }
}
