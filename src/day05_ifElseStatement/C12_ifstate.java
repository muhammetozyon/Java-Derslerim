package day05_ifElseStatement;

import java.util.Scanner;

public class C12_ifstate {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        //         Hem 3, hem 5'e bolunuyorsa SUPER yazdirin
        //         ikisine de bolunemeyen sayilar icin YAZIK yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Bir Tamsayı Giriniz");

        int girilensayi = scanner.nextInt();

        if (girilensayi % 3 == 0 && girilensayi %5 == 0) {
            System.out.println("Super"); }

            else if (girilensayi%3==0) {
                System.out.println("3 ile Bolunebılen Sayi");}
            else if (girilensayi%5==0) {
            System.out.println("5 ile Bolunebılen Sayi");}
            else {
            System.out.println("YAZIK");}







    }
}
