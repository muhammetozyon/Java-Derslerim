package day08_StringManipulitions;

import java.util.Scanner;

public class C98_ornek1Grup {
    public static void main(String[] args) {

        //Soru 2:Kullanicidan pozitif bir tamsayi alin,
        // 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozıtıf bir tamsayı giriniz");

        int sayi= scanner.nextInt();
        if (sayi>0){

        for (int i=1; i <=sayi; i++){

            if (i%7==0) {
                System.out.println(i);


            }

            }


        }











    }
}
