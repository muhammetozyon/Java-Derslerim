package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan bir tamsayı isteyin
        //girilen sayının 2 katını yazdırın

        //kullanıcıddan bır deger almak istenıyorsa
        // 1)scanner objesı olusturmak

        Scanner scanner = new Scanner(System.in);

        //2)kullanıcıya ne ıstegımızı soyleyin

        System.out.println("Lutfen bir tamsayı girin");

        //3)kullanıcını gırecegı bır data turune uygun bır verıable olusturun.
        //scenner abjesı ıle verıable ye uygun bır hazır methot kullanıp kulanıcıdan deger alın ve olusturdugumuz
        //verıableye atayın

        int girilensayi = scanner.nextInt();

        System.out.println("Girdiginiz sayının 2 katı:"+ 2*girilensayi);








    }


}
