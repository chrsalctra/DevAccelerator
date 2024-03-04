package Section12;

public class Excercise12 {
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        String input = "91-044 56 9877 2976545";
        input = input.replaceAll(" ","").replaceAll("-","");
        int counter = 1;
        char tempArray[] = new char[100];
        for(int i=1;i<=input.toCharArray().length;i++){
            tempArray[counter-1]=input.toCharArray()[i-1];
            if(i%3==0 && !(i == input.toCharArray().length)){
                tempArray[counter]='-';
                counter++;
            }
            counter++;
        }
        return String.valueOf(tempArray).trim();
    }
}