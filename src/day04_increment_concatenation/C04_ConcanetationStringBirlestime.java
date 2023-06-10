package day04_increment_concatenation;

public class C04_ConcanetationStringBirlestime {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candır";
        String s3 = " ";
        String s4 = "";

         int i1 = 3;
         int i2 = 4;

         // 34 Candır

        System.out.println(s4+i1+i2+s3+s2); // s4 u ekledık cunku strıklestırdık .. integeri strıng yapmak için
                                                // basına strıng eklerız


         //12 Java
        System.out.println((3*4)+s3+s1);

         //Java 7

        System.out.println(s1+s3+(i1+i2));

         //java Candır yazalım

        System.out.println(s1+s3+s2);

        // java 34

        System.out.println(s1+s3+i1+i2); //sol tafarfatan basladıgı için strıng int yi yedı




    }


}
