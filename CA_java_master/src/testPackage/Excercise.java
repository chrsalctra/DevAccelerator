package testPackage;
import java.util.Arrays;
public class Excercise {
    public static void main(String[] args) {
        System.out.println(printResult());
        System.out.println(printResult2()); // Lesson 23
        Excercise[] test = new Excercise[2];
    }
    public static String printResult(){
        return "Row, row, row your boat\nGently down the stream!!!";
    }
    public static int printResult2(){
        float x = 5.2f;
        int y = (int)x;
        return y;
    }
}