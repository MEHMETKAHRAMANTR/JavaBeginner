package practice_day06;

import java.util.Scanner;

public class methodCreation {
        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak "asal sayi" veya "asal sayi degil"
        sonuclarini donduren bir method olusturun.
         */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        System.out.println(asalSayiKontrol(sayi));

    }
    public static String asalSayiKontrol(int sayi) {
        String sonuc = "sayı asaldır";
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc = "asal sayı dağilidr";
            }

        }return sonuc;
    }
}
