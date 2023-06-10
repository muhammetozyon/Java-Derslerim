package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //      Kullanicidan ismini, soyismini ve yasini alip,
        //      asagidaki formmatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : DOE
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sırasıyla ısmınızı,soyısmınızı ve yasınızı gırınız");
        String isim= scanner.nextLine();
        String soyısım= scanner.nextLine();
        int yas = scanner.nextInt();

        //System.out.println("ısmınız:"+ isim");
        //System.out.println("soyisminiz"+ soyısım);
        //System.out.println("yasınız"+ yas);
        //System.out.println("kaydınız basarıyla tamamlanmıstır");

        //System.out.println("kaydınız basarıyla tamamlanmıstır");


        System.out.println("ısmınız:"+ isim + "soyisminiz"+ soyısım + "yasınız"+ yas+
                "kaydınız basarıyla tamamlanmıstır");









    }




}
