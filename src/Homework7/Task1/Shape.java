package Homework7.Task1;

public class Shape {

    int sides;
    int[] sideLengths = new int[sides];

    Shape(int sides, int[] sideLengths) {
        this.sides = sides;
        for (int i = 0; i < sides; i++) {
            this.sideLengths[i] = sideLengths[i];
        }
    }

    Shape() {

    }

    int perimeter () {
        int perimeter = 0;
        for (int i : sideLengths) {
            perimeter += i;
        }
        return perimeter;
    }
}
