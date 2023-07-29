package practice_day06;

public class UcgenHarfTablosu {
    public static void main(String[] args) {
        /*
         A
         A B
         A B C
         A B C D
         A B C D E
         A B C D E F
         şeklini yazdırınız.  65=A'nın ascıı değeri
         */

        int harf=66;

        for (int satir = 0; satir <10 ; satir++) {
            for (int sutun = 0; sutun <=satir ; sutun++) {
                System.out.print((char)(harf+sutun)+" ");

            }
            System.out.println("");
        }

    }
}
