package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

            //kullanıcıdan ismini ısteyın
            //ismi buyuk harfe cevirip kaydedin
            //sonra kullanıcıya yenı halını yazdırın

            Scanner scanner = new Scanner(System.in);
                 System.out.println("Lutfen ismnizi giriniz");


        String girilenİsim= scanner.nextLine();

        //next lıne () yazılan bılgının tmunu getırir,
        //next () ılk sapece kadar olan kısmını getırır

        girilenİsim= girilenİsim.toUpperCase();
        System.out.println("Girilen İsmin duzenlenmis hali :" + girilenİsim);


    }


}




