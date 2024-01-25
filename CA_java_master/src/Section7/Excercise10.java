package Section7;

class Animal{
    // Write your animal class attribute and constructors here.
    public String name;
    public Animal(){
        this.name = "Unknown Animal";
    }
    public Animal(String name){
        this.name = name;
    }
}

public class Excercise10 {

    public static void main(String[] args) {
        Animal one = new Animal();
        Animal two = new Animal("Zebra");
        System.out.println(printResult(one, two));
    }

    public static String printResult(Animal one, Animal two){
        // Write your logic here to return expected patter as string
        // Expected Result : animal_1 name : Tiger | animal_2 name : Unknown Animal
        //instructions are wrong, logic is supposed to be here but instructions say main.
        return  "animal_1 name : " + two.name + " | animal_2 name : " + one.name;
    }
}