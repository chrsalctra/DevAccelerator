package Section13;

public class MyException extends Exception{
    String message;
    MyException(String message) {
        this.message = message;
    }
}
