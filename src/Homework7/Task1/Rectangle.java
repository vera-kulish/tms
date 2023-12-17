package Homework7.Task1;

public class Rectangle extends Shape {

    public Rectangle(int side1, int side2, int side3, int side4) throws IncorrectInputException {
        //check that the parameters for the rectangle are correct
        boolean parametersAreCorrect = false;
        if(side1 == side2 && side3 == side4)
            parametersAreCorrect = true;
        else if(side1 == side3 && side2 == side4)
            parametersAreCorrect = true;
        else if (side1 == side4 && side2 == side3)
            parametersAreCorrect = true;

        if(parametersAreCorrect) {
            this.sideLengths = new int[4];
            this.sideLengths[0] = side1;
            this.sideLengths[1] = side2;
            this.sideLengths[2] = side3;
            this.sideLengths[3] = side4;
        }
        else
            throw new IncorrectInputException("Wrong parameters for the rectangle");
    }

    public double area() {
        if(sideLengths[0] != sideLengths[1])
            return sideLengths[0] * sideLengths[1];
        else
            return sideLengths[0] * sideLengths[2];
    }
}
