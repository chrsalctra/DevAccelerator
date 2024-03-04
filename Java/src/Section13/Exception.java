package Section13;
public class Exception {
    public static void main(String[] args) {
        try {
            doSomething();
            throw new MyException("My msg");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number"); // a way
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Only numbers 1 to 4"); // another way
        } catch (MyException e) {
            System.out.println("This is my exception"); // another way
        } catch (Exception e) {
            System.out.println("Something wrong!");
        }
    }
        public static void doSomething() throws ArrayIndexOutOfBoundsException, NumberFormatException{
            int userInput = 0;
            userInput = Integer.parseInt("8");
            String[] fruits = {"bananas", "watyermelons", "apples", "oranges"};
            System.out.println("User Piucked " + fruits[userInput - 1]);
        }
    }

