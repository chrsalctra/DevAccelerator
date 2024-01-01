package CA_java_udemy.statics ;

import CA_java_udemy.statics.TestStatic;

public class main {
    public static void main(String[] args){
        TestStatic obj01 = new TestStatic();
        System.out.println("obj01 static var: " + obj01.getStaticVar());
        obj01.setStaticVar(25);
        System.out.println("obj01 static var: " + obj01.getStaticVar());

        TestStatic obj02 = new TestStatic();
        System.out.println("obj02 static var: " + obj02.getStaticVar());
    }
}
