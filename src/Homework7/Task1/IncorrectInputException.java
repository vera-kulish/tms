package Homework7.Task1;

public class IncorrectInputException extends RuntimeException {

    public IncorrectInputException() {

    }

    public IncorrectInputException(String errorMessage) {
        super(errorMessage);
    }
}
