package day10_nestedFoorLoop_method;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;
        *
        * *
        * * *
        * * * *
        * * * * *
     */

            int sayi = 5;

            for (int i = 1; i <= sayi; i++) { // outer ==> satirlar
                for (int j = 1; j <= i; j++) { // inner ==> sutunlar
                    System.out.print("* ");
                }
                System.out.println("");
            }




            // int number=5;
        //for (int i = 1; i <=number ; i++) {
          //  for (int j = 1; j <=i; j++) {
            //    System.out.print("*"+" ");
          //  }
            //System.out.println(" ");
        //}
        //for (int k = number-1; k >=1 ; k--) {
          //  for (int l = 1; l <=k; l++) {
            //    System.out.print("*"+" ");
            //}
           // System.out.println(" ");



        }
    }
