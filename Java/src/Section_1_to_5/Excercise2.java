package Section_1_to_5;

class Employee{
    String emp_name; // instance variables
    int emp_id;
    String address;
}

public class Excercise2 {
    public static void main(String[] args){
        System.out.println(printDetails());
    }
    public static String printDetails(){
        Employee e = new Employee();
        e.emp_id = 1001;
        e.emp_name="James";
        e.address="13th St, New York";
        return "Section_1_to_5.Employee Name is " + e.emp_name + " and Section_1_to_5.Employee ID is " + e.emp_id + " and Section_1_to_5.Employee Address is " + e.address;
    }
}