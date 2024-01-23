package Section_1_to_5;

public class Excercise7 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2048) );
    }

    public static boolean isLeapYear(int year)
    {
        boolean step_1 = (year % 4) == 0;
        boolean step_2 = (year % 100) != 0;
        boolean step_3 = ((year % 100 == 0) && (year % 400 == 0));

        return step_1 && (step_2 || step_3);
    }
}