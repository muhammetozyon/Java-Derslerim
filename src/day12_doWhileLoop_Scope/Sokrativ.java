package day12_doWhileLoop_Scope;

public class Sokrativ {


        public static void main(String[ ] args) {

            go();

            go(12);

            go(5 >= 5);

        }

        public static void go() {

            System.out.println("Bad");

        }

        public static void go(double i) {

            System.out.println("Good");

        }

        public static void go(boolean b) {

            if (b) {

                System.out.println("The best");

            } else {

                System.out.println("The worst");

            }

        }



    }
