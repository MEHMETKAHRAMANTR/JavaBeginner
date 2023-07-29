package practice_day06;

import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {
        //kullanıcadan 2 sayı alıp ebob ve ekoko'unu bulup yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif 2 tam sayı giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int flag = 0;
        System.out.println("Girdiğiniz sayılar sırasıyla : " + num1 + " - " + num2);

        //önce ebob hesaplayalım
        //ilk olarak sayılardan küçük olanı ebop değişkenine atıyoruz

        int limitEbob = 0;

        if (num1 < num2) {
            limitEbob = num1;
        } else {
            limitEbob = num2;
        }
        //atanan limitEbob değerini azaltarak en büyük ortak böleni buluyoruz

        for (int i = limitEbob; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("bu sayıların obebi: " + i);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("bu iki sayının ortak böleni yoktur.");
        }

        //girilen Sayıların Ekok'unu yazdıralım

        flag=0;
        //fooLoop yazarken 1 den başlayıp bir limit koyarak i değerini 1Er artırarak ilerleyeceğiz

        for (int i = 1; i <100000 ; i++) {

            if(i%num1==0 && i%num2==0){
                System.out.println("Girdiğiniz sayıların Ekoku: "+i);
                flag++;
                break;
            }


        }
        if(flag==0){
            System.out.println("girdiğiniz değerlerin 100000'den küçük ortak katı yoktur");
        }

    }
}
