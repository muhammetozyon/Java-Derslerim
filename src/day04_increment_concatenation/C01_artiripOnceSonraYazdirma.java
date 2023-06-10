package day04_increment_concatenation;

import java.util.Scanner;

public class C01_artiripOnceSonraYazdirma {
    public static void main(String[] args) {


        // Kullanicidan bir tam sayi isteyin
        // Girilen tam sayiyi yazdirip
        // sonra 1 artirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayi : " + girilenSayi);

        girilenSayi++;

        // kullanicidan bir sayi daha alin
        // bu sayiyi once artirin
        // sonra yazdirin

        System.out.println("Lutfen bir tamsayı daha giriniz");

        int girilenSayi2 = scanner.nextInt();

        girilenSayi2++;
        System.out.println("girilen 2.sayi" + girilenSayi2);

        System.out.println("kodun sonunda girilen 1.sayi"+ girilenSayi + ", girilen 2.sayi"+ girilenSayi2);








    }
}
