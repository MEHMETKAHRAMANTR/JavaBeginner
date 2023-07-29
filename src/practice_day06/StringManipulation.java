package practice_day06;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        /*
        /*
          Kullanicidan bir cumle alin
          - cumlede ev geciyorsa, "home home sweet home" yazdirin
          - cumlede is geciyorsa, "calismak guzeldir"
          - ikisini de iceriyorsa "Hem ev lazim hem is"
          - hicbirini icermiyorsa "cok calisman lazim" yazdirin.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız");
        String cumle=scanner.nextLine();
        String cumle2= cumle.toLowerCase();

        if (cumle2.contains("ev") && cumle2.contains("is")){
            System.out.println("Hem ev lazim hem is");

        }else if (cumle2.contains("ev")){
            System.out.println("home home sweet home");
        }else if (cumle2.contains("is")){
            System.out.println("çalışmak güzeldir");
        } else {
            System.out.println("çok çalışmak gerekir");
        }





    }
}
