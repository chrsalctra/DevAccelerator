package Section_1_to_5;

public class MethodSample {
    public static void main (String[] args) {
        MethodSample obj = new MethodSample();
        obj.sayHello("Female");
    }
    public void sayHello(String gender) {
        String newText = gender.equals("Male") ? "hello, sir" : "hello, miss"; //shorthand* !
        System.out.println(newText);
    }
}
