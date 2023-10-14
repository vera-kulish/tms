package Homework9;

public class WrongLoginException extends RuntimeException{

    WrongLoginException() {

    }

    WrongLoginException(String errorMessage) {
        super(errorMessage);
    }
}
