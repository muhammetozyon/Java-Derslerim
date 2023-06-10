package day10_nestedFoorLoop_method;

public class C12_FaktoryelSonucuDondurme {

    public static int faktoryelDegeriDondur(int sayi) {
        int faktoryel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
        }
        return faktoryel;
    }

    public static void main(String[] args) {
        // Verilen sayinin faktoryel degerini hesaplayip
        // sonucu donduren bir method olusturun


        System.out.println(faktoryelDegeriDondur(6)); //720
        int yediFaktoryel = faktoryelDegeriDondur(7);

    }
}
