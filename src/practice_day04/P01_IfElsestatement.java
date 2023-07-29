package practice_day04;

import java.util.Scanner;

public class P01_IfElsestatement {
    public static void main(String[] args) {
        /*
        kenar değerleri girilen bir üçgenin dik üçgen olup olmadığını
        kontrol edip dönüt veren kod dizisi yazınız

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunlukalrını giriniz");
        System.out.print("1. Kenar: ");
        int a= scan.nextInt();
        System.out.print("2. Kenar: ");
        int b= scan.nextInt();
        System.out.print("3. Kenar: ");
        int c= scan.nextInt();

        if ((a*a)+(b*b)==(c*c)){
            System.out.println("girdiğiniz değerler sahip üçgen dik üçgendir");

        } else if ((a*a)+(c*c)==(b*b)) {
            System.out.println("girdiğiniz değerler sahip üçgen dik üçgendir");
        } else if ((b*b)+(c*c)==(a*a)) {
            System.out.println("girdiğiniz değerler sahip üçgen dik üçgendir");

        } else {
            System.out.println("girdiğiniz değerler dik üçgene ait değildir");
        }
        System.out.println("=======================2.ÇÖZÜM================");
        if ((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)||(a*a)+(c*c)==(b*b)){
            System.out.println("girdiğiniz değerler sahip üçgen dik üçgendir");
        }else {
            System.out.println("girdiğiniz değerler dik üçgene ait değildir");
        }

    }
}
