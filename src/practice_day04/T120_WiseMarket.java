package practice_day04;

import java.util.Scanner;

public class T120_WiseMarket {

        /*
        ====================WISE MARKET===================================
     ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET
   secime gore ,
   4-urunleri listele ve
   5-fiyatlari gelsin
    variable'ları belrileyelim:   urunAdi, urunFiyati, urunMiktari, urunKodu, sepet, toplam,
         */

    static Scanner scan=new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet="";
    static double toplam;

    public static void main(String[] args) {
        girisEkranı();

    }

        public static void girisEkranı() {
        System.out.println("========== WİSE MARKET ==========");
        System.out.println("");
        System.out.println("-------------- Menü -------------");
        System.out.println("Lütfen Alışveriş yapmak İstediğiniz Reyonu Seçiniz");
        System.out.println("1 - Şarküteri Reyonu\n2 - Manav Reyonu\n3 - Market Reyonu\n4 - Fiş yazdır\n5 - Çıkış");

        int secim =scan.nextInt();
        if (secim<1 || secim>5) {
            System.out.println("geçersiz bir tuşa bastınız. tekrar giriniz");
            girisEkranı();


        }else {
            switch (secim){
                case 1:
                    sarkuteri();
                  break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }


    }

    public static void cikis() {
        System.out.println("Çıkış Ekranı");
    }

    public static void fisYazdir() {
        System.out.println("Alışveriş Fişi");
    }

    public static void market() {
        System.out.println("Manav reyonuna hoş geldniz");
    }

    public static void manav() {
        System.out.println("Manav reyonuna hoş geldniz");
    }

    public static void sarkuteri() {
        System.out.println("Şarküteri reyonuna hoş geldniz");
    }

    public static double getToplam() {
        return toplam;
    }

}
