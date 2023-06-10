package day05_ifElseStatement;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Notununzu Giriniz");

        double not = scan.nextDouble();

        if (not>=50)

            System.out.println("Sınıfı Gcetin");

        if (not<50)

            System.out.println("Malsef Kaldın");
         /*
            onceki sorulardan farkli olarak
            bu soruda iki if birbirine bagimlidir
            iki if'den sadece 1'i calisir
            ikisinin birden calisma ihtimali yoktur
            ikisinin de calismama ihtimali de yoktur
         */
        if (not>=50) {
            System.out.println("sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }
        /*
             if ve else body'leri tek bir boolean sarta bagimlidir
            ikisinden sadece 1'i calisir
            ikisinin birden calisma ihtimali yoktur
            ikisinin calismama ihtimali de yoktur
         */





    }
}
