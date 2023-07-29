package practice_day02;

import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {
        /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */

        Scanner scan=new Scanner(System.in);
     //  System.out.println("lütfen haftanın gününü yazınız");
     //  String gunAdi=scan.next().toLowerCase();
     //  if (gunAdi.equals("cumartesi")||gunAdi.equals("pazar")) {
     //      System.out.println("girdiğiniz gün hafta sonu");
     //  }
     //  if (gunAdi.equals("pazartesi")||gunAdi.equals("salı")||gunAdi.equals("çarşamba")||gunAdi.equals("perşembe")||gunAdi.equals("cuma")) {
     //      System.out.println("girdiğiniz gün hafta içi");
     //  }
     //  if (!(gunAdi.equals("cumartesi")||gunAdi.equals("pazar")||gunAdi.equals("pazartesi")||gunAdi.equals("salı")||gunAdi.equals("çarşamba")||gunAdi.equals("perşembe")||gunAdi.equals("cuma"))) {
     //      System.out.println("yanlış gün girdiniz");
     //  }


        /*

           2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
            Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
            Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
            50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
            Ad:
            Soyad:
            1.Vize:
            2. Vize:
            Final :
            Yıl Sonu Notu:
            Ders Durumu :
            */

        System.out.println("Lütfen Adınızı Giriniz");
        String name=scan.nextLine();
        System.out.print("Lütfen Soyadı Giriniz: ");
        String soyad=scan.nextLine();
        System.out.print("vize1: ");
        double vize1= scan.nextDouble();
        System.out.print("vize2: ");
        double vize2= scan.nextDouble();
        System.out.print("Final Notu: ");
        double finalnotu=scan.nextDouble();
        double yilSonuNotu=(((vize1+vize2)/2)*40/100)+(finalnotu*60/100);
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+soyad);
        System.out.println("1.Vize: "+vize1);
        System.out.println("2. Vize: " + vize2);
        System.out.println("Final Not"+ finalnotu);
        if (yilSonuNotu>50) {
            System.out.println("Geçtiniz");
        }
        if (yilSonuNotu<50){
            System.out.println("maalesef kaldınız");
        }

    }
}
