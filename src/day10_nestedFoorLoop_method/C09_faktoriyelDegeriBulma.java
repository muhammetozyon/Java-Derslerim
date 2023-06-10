package day10_nestedFoorLoop_method;

public class C09_faktoriyelDegeriBulma {

    public static void main(String[] args) {

        // verdigimiz bir sayının faktoriyel degerini bulun
        //bır method olusturun

        faktoryelDegeriYazdirin(5);

    }


    public static void faktoryelDegeriYazdirin (int sayi){

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;

        }
        System.out.println(sayi+ "! = " + faktoryel);

    }


    
}
