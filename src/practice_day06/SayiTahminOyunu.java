package practice_day06;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
          /*
            Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
            Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
            bilince de tebrik edip durduran bir kod yazalim
             */

        //int sayi=138;
        Random random=new Random();
        int sayi= random.nextInt(150);
        System.out.println("aklımdan bir sayı tuttum Hadi tahmin Et!");
        Scanner scanner=new Scanner(System.in);
        boolean doğruMu=false;
        while (!doğruMu){
            int tahmin=scanner.nextInt();
            if (tahmin>sayi){
                System.out.println("çok söyledin. düşür");
            }else if(tahmin<sayi){
                System.out.println("az söyledin. yükselt");
            }else if (tahmin==sayi){
                System.out.println("tebrikler");
                doğruMu=true;
            } else {
                doğruMu=false;

            }
        }
    }
}
