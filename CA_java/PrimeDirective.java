// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  public PrimeDirective (){
    System.out.println("Instance created!");
  }
  public boolean isPrime(int number) {
    if (number ==2) {
      return true;
    }
    if (number <2) {
      return false;
    }
    for (int i = 2; i<number; i++){
      if (((number / number) == 1) && (number%i != 0)){
        continue;
      } else {
        return false;
      }
    } return true;
  }
  public ArrayList<Integer> onlyPrimes(int[] nums){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int number : nums) {
      if (isPrime(number)) {
        arr.add(number);
      }
    } return arr;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers));
  }  
}