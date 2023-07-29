package practice_day04;

import java.util.Scanner;

public class P02_TernaryOperators {
    public static void main(String[] args) {
         /*
        kenar değerleri girilen bir üçgenin ikiz kenar üçgen olup olmadığını
        kontrol edip dönüt veren kod dizisi yazınız

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunlukalrını giriniz");
        System.out.print("1. Kenar: ");
        int a = scan.nextInt();
        System.out.print("2. Kenar: ");
        int b = scan.nextInt();
        System.out.print("3. Kenar: ");
        int c = scan.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a == b || b == c || a == c) {
                System.out.println("girdiğiniz değerler sahip üçgen ikizkenat üçgendir");
            } else {
                System.out.println("girdiğiniz değerler ikiz kenar üçgene ait değildir");
            }

        } else {
            System.out.println("yanlış değer giridinz");
        }


        System.out.println("======================2.ÇÖZÜM=====================");

        System.out.println(a > 0 && b > 0 && c > 0 ?
                (a == b || b == c || a == c ?
                        "girdiğiniz değerler sahip üçgen ikizkenat üçgendir" : "girdiğiniz değerler ikiz kenar üçgene ait değildir") :
                "yanlış değer giridinz");

    }
}
