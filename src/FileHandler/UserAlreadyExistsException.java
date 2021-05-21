package FileHandler;

import java.util.InputMismatchException;

public class UserAlreadyExistsException extends InputMismatchException {
    UserAlreadyExistsException(){
        super("Exception: User already exists");
    }
}
