package day04_increment_concatenation;

public class C06_LogicalOparators {
    public static void main(String[] args) {

        int a= 10;
        int b = 20;
        int c = 30;

        // ucunun bırbırıne esit oldugunu kontrol edin

        //System.out.println(a==b==c); // javada karsılastırma oparatorlerı sadece 2 verıableyı
        // karsılastırırır

       //3 unun bırıbırne sıt oldugunu kontrol edın

        System.out.println(a == b  && b == c ); //  false

        // a sayısının pozitif ve 2 ıle tam bolunebılır oldugunu kontrol edın

        System.out.println(a>0 && a%2==0    ); //true

        // b sayısının 10 ile 50 arasında oldugunu kontrol edınız

        System.out.println(10<b && 50>b ); // true

        //  b sayısının 10 ile 50 arasında olmadıgını kontrol edın

        System.out.println(b<10 || b>50); // fulse

        // aralık olursa && ısaretı .. bır aralıgın dısı ıstenıyorsa || isareti konulur







    }




}
