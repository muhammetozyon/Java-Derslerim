package day12_doWhileLoop_Scope;

public class socrativ3 {
    public static void method1(float i, int j){

        System.out.println("Good");

    }

    public static void method1(double i, double j){

        System.out.println("Bad");

    }

    public static void main(String[] args){

        method1(2.1f, 3.2);

    }
}
