package practice_day06;

import java.util.Scanner;

public class methodCreation2 {
            /*
            Kullanicidan main method icinde ayri ayri isim ve soyismini alin
            İsim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
            İsim bosluk soyisim seklinde bize donduren bir method olusturun
            */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen adınızı girini");
        String isim= scanner.nextLine(); //next yazılırsa ilk boşluğa kadar alır. nextline yazılırsa satırı alır
        System.out.println("lütfen soyadınızı giriniz");
        String soyisim= scanner.nextLine();

        System.out.println(isimSoyisimYazdir(isim, soyisim));



    }

    public static String isimSoyisimYazdir(String isim, String soyisim) {
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();
        String duzenliIsim=isim+" " +soyisim;

        return duzenliIsim;
    }


}
