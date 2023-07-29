package practice_day02;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 2 adet bir sayı giriniz");
        System.out.print("Birinci sayı: ");
        double sayi1=scan.nextDouble();
        System.out.print("İkinci Sayıyı giriniz: ");
        double sayi2= scan.nextDouble();
        System.out.println("Girdiğiniz 1. Sayı: "+sayi1+"'dir\n"+"Girdiğiniz 2. sayı: "+sayi2+"'dir");
        System.out.println("=======hokus pokus===========\nsayılar yer değiştirdi");
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Girdiğiniz 1. Sayı: "+sayi1+"'dir\n"+"Girdiğiniz 2. sayı: "+sayi2+"'dir");




    }
}
