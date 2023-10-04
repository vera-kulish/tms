package Homework7.Task1;

public class Triangle extends Shape {

    Triangle(int side1, int side2, int side3) {
        this.sideLengths = new int[3];
        this.sideLengths[0] = side1;
        this.sideLengths[1] = side2;
        this.sideLengths[2] = side3;
    }

    double area() {
        int halfPer = (sideLengths[0] + sideLengths[1] + sideLengths[2]) / 2;
        double area = Math.sqrt((halfPer - sideLengths[0])*(halfPer - sideLengths[1])*(halfPer - sideLengths[2]));
        return area;
    }
}
