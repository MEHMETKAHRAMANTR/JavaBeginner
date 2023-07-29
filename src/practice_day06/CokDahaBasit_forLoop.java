package practice_day06;

import java.util.Scanner;

public class CokDahaBasit_forLoop {
    public static void main(String[] args) {
        /*

            Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
            dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
            baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("başlangıç değeri: ");
        int basDeger=scanner.nextInt();
        System.out.print("bitiş değeri: ");
        int bitDeger=scanner.nextInt();

        int toplam=0;

        if (basDeger>bitDeger){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");

        } else {
            for (int i = basDeger; i <= bitDeger; i++) {
                toplam+=i;

            }

        }
        System.out.print("girilen değerlerin arasındaki sayıların toplamı: "+toplam);

    }
}
