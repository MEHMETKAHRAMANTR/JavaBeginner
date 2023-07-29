package practice_day07;

import java.util.*;

public class binaryeCevirme {
    public static void main(String[] args) {
        /*
         1. SORU
    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    Örnek: 12 = 1 1 0 0
         */

        System.out.print("Desimal değer giriniz: ");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        System.out.println(sayi+" desimal sayısının binary karşılığı: "+ binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {
        List<Integer> binary=new ArrayList<>();
        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;
        }
     //  List<Integer> tersBinary=new ArrayList<>();
     //  for (int i = binary.size()-1; i >=0 ; i--) {
     //      tersBinary.add(binary.get(i));
     //  }
     //  return tersBinary;
        // daha kolay bir metod isterseniz : aşağıda
        Collections.reverse(binary);
        return binary;

    }
}
