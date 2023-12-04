public class Magic {
  //program where any myNumber equals 3 at the end.
	public static void main(String[] args) {
      int myNumber = 20000;
      // myNumber is original (2)
      int stepOne = myNumber * myNumber;
      int stepTwo = stepOne + myNumber;
      int stepThree = stepTwo / myNumber;
      int stepFour = stepThree + 17;
      int stepFive = stepFour - myNumber;
      int stepSix = stepFive / 6;
      System.out.println(stepSix);
	}
}