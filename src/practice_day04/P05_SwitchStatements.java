package practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        /*
        kullanıcadan gün ismi isteyin kaçıncı gün olduuunuz yazdırın

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bugün günlerden hangisi?");
        String gun=scan.next();
        gun=gun.toLowerCase();

        switch ((gun)){
            case "pazartesi"://switch caselerde sayı ise direk yazılır metin ise " " arasında yazlır
                System.out.println(gun +" haftanın 1. günüdür");
                break;
            case "salı":
                System.out.println(gun +" haftanın 2. günüdür");
                break;
            case "çarşamba":
                System.out.println(gun +" haftanın 3. günüdür");
                break;
            case "pperşembe":
                System.out.println(gun +" haftanın 4. günüdür");
                break;
            case "cuma":
                System.out.println(gun +" haftanın 5. günüdür");
                break;
            case "cumartesi":
                System.out.println(gun +" haftanın 6. günüdür");
                break;
            case "pazar":
                System.out.println(gun +" haftanın 7. günüdür");
                break;
            default:
                System.out.println("yanlış gün girdiniz");
        }

    }

}
