package CA_java_udemy;
import java.util.Scanner;

public class Inputs {
    public static void main (String[] args){
        System.out.println("whats your age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("age " + age);
        scanner.close();
            
    }
}