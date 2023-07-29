package practice_day06;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        /*
        SORU -1:
 Çarpım tablosunu ekrana yazdıran bir program yazın (örneğin 1x1'den 10x10'a kadar).
         */

     // for (int i = 1; i <= 10; i++) {
     //     for (int j = 1; j <=10 ; j++) {
     //         System.out.println(i+" * "+ j + "= "+(i*j)+"\t");

     //     }

     // }
        /*
            /*
Soru 2:
Kullanıcıdan bir sayı girişi alın ve 1'den o sayıya kadar olan tek sayıları ekrana yazdırın.
     */

     // Scanner scanner= new Scanner( System.in);
     // System.out.println("lütfen bir tam sayı giriniz");
     // int n=scanner.nextInt();
     // for (int i = 1; i < n; i++) {
     //     if (!(i%2==0)){
     //         System.out.println(i+" ");
     //     }


     // }
     //
     //

        /*

            Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
            dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
            baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


         */

        Scanner scanner= new Scanner( System.in);
        System.out.println("Başlangıç değerini giriniz");
        int baslangic=scanner.nextInt();
        System.out.println("Bitiş değerini giriniz");
        int bitis=scanner.nextInt();
        int toplam=0;
        if (bitis<baslangic){
            System.out.println("başlangıç bitişten büyük olamaz");

        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;


            }
        }

        System.out.println(toplam);


    }
}
