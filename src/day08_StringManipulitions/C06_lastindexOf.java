package day08_StringManipulitions;

public class C06_lastindexOf {
    public static void main(String[] args) {

        String str = "Java cok faydali";
        System.out.println(str.lastIndexOf("a")); //13
        System.out.println(str.lastIndexOf("a", 10)); //10
        System.out.println(str.lastIndexOf("a", 12)); //10

        System.out.println(str.lastIndexOf("a", 5));

        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));

        System.out.println(str.lastIndexOf("a",12));

        System.out.println(str.lastIndexOf('a'));

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        String str1 = "java cok kolay";
        String str2= "cok";

        int bastanindex = str1.indexOf(str2);
        int sondanindex = str1.lastIndexOf(str2);



        if (bastanindex ==-1) {
            System.out.println("aradıgınız kelime cumlede hıc kullanılmamıs");
        } else if (bastanindex==sondanindex) {
            System.out.println("aradıgınız kelime 1 defa kullanılmıs");

        }else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }


    }
}
