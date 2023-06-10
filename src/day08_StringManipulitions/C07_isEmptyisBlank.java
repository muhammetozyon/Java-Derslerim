package day08_StringManipulitions;

public class C07_isEmptyisBlank {
    public static void main(String[] args) {
        String str = "Java candir";
        // str boşmu
        System.out.println(str.isEmpty()); // false
        // str sadece boşluklardan mı oluşuyor
        System.out.println(str.isBlank()); // false

        str = "              ";
        System.out.println(str.isEmpty());  // false
        System.out.println(str.isBlank());  // true


        str ="";
        System.out.println(str.isEmpty());  // true
        System.out.println(str.isBlank());  // true
        System.out.println(str.length()); // true
    }
}
