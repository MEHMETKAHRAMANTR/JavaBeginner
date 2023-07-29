package practice_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
                   /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aşğıdaki bilgileri giriniz!");
        System.out.print("Adınız: ");
        String name=scan.nextLine();
        System.out.println();
        System.out.print("Soyadınız: ");
        String surname=scan.nextLine();
        System.out.println();
        System.out.print("Yaşınız: ");
        int yas = scan.nextInt();
        System.out.println();
        System.out.print("Mail Adresiniz: ");
        String mail=scan.next();
        System.out.println();
        System.out.print("Şifreniz: ");
        String pass= scan.next();
        System.out.println();
        System.out.println(" ****       KAYIT BAŞARILI      *****");
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surname);
        System.out.println("Yaşınız: "+yas);
        System.out.println("Mail Adresiniz: "+mail);
        System.out.println("Şifreniz: "+pass);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");




    }


}
