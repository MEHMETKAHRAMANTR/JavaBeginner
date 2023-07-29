package practice_day02;

import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen alanı hesaplanacak olan üçgenin ayrıtlarını giriniz");
        System.out.print("üçgenin bir uzunluğunu griniz: ");
        double kenar=scan.nextDouble();
        System.out.print("girdiğiniz kenara ait yüksekliği giriniz: ");
        double yukseklik = scan.nextDouble();
        System.out.println("üçgenin alan hesabının sonucu");
        System.out.println("Üçgenin alanı: "+(kenar*yukseklik)/2);
    }
}
