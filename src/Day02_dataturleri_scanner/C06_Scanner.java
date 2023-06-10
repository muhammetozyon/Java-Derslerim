package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullasnıcıdan bır double bır de ınt sayı alıp
        // bunların toplamını ve carpımını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ondalıklı bır sayı giriniz");

        double ondalıklıSayı= scanner.nextDouble();
        System.out.println("Lutfen bır tamsayı gırınız");

        int tamSayı= scanner.nextInt();

        System.out.println(ondalıklıSayı+tamSayı);
        System.out.println(ondalıklıSayı*tamSayı);






















    }



}
