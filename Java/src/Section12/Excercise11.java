package Section12;

public class Excercise11 {
    public static void main(String[] args) {
        System.out.println(printResult() );
    }

    public static String printResult(){
        String finalStr = "       JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy    ";
        finalStr = finalStr.trim().toLowerCase().replaceAll(",","-");
        String strArr[] = finalStr.split(" ");
        return finalStr+ "\nTotal words in this string is "+strArr.length;
    }
}
