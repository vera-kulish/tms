package Homework7.Task1;

public class Circle extends Shape {

    public Circle(int circumference) {
        this.sideLengths = new int[1];
        this.sideLengths[0] = circumference;
    }

    public double area() {
        return (sideLengths[0] * sideLengths[0]) / (4 * 3.14159);
    }
}
