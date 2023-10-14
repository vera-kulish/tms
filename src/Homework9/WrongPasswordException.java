package Homework9;

public class WrongPasswordException extends RuntimeException {

    WrongPasswordException() {

    }

    WrongPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
