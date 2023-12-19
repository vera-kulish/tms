package Homework11;

public class ObjectNotFoundException extends RuntimeException {

    ObjectNotFoundException() {

    }

    ObjectNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
