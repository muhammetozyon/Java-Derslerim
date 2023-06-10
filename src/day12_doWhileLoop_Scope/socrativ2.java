package day12_doWhileLoop_Scope;

public class socrativ2 {

    public static void method1(float i, int j){

        System.out.println("Good");

    }

    public static void method1(double i, double j){

        System.out.println("Bad");

    }

    public static void main(String[] args){

        method1(1.2, 3);

    }

}

