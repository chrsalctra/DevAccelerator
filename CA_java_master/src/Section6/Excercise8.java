package Section6;

public class Excercise8 {

    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult() {
        String finalStr = "";
        for (int i = 1; i <= 4; i++) {
            String s = "";
            for (int j = 1; j <= i; j++) {
                s = s + "*";
            }
            finalStr = finalStr + s + "\n";
        }
        return finalStr;
    }
}
