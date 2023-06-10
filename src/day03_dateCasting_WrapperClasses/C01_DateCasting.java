package day03_dateCasting_WrapperClasses;

public class C01_DateCasting {
    public static void main(String[] args) {
        int in1= 10;
        short shrt = 12;
        byte byt = 15;
        long lng= 20;

        boolean b1 = true;
        char chr = 'a';
        float flt = 1.2f;
        double dbl = 3.2;

        String str = "java Candır";

        //chr = byte ;

         /*
            bir data turundeki variable'a baska data turunden deger atanabilir mi ?
           bazi data turleri deger olarak baska data turundeki degerleri ASLA kabul etmez..
           Sayisal deger alan primitive data turlerinde ise
           daha kapsamli olan data turundeki variable,
           daha dar kapsamli data turundeki degeri OTOMATIK olarak kabul eder
         */
        // chr = byt;
        // chr = str;
        // chr = flt;

        // bl = in1;
        // bl = "true";

        // str = bl;
        // str = chr;
        // str = shrt;

        in1 = shrt;
        in1 = byt;  //kendinden kucuk olanları kabul ediyor

        // in1 = lng;  //kendinden buyuk olanları kabul etmiyor
        // in1 = dbl;
        // in1 = flt;

        lng = byt;
        lng = shrt;
        lng = in1;

        // lng = flt;
        // lng = dbl;

        dbl = byt; //doble en buyuk oldugu için hepsını kaul edıyor
        dbl = shrt;
        dbl = in1;
        dbl = lng;
        dbl = flt;

        // byt = shrt; //
        // byt = in1;
        // byt = lng;
        // byt = flt;
        // byt = dbl;






    }





}
