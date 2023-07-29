package oyun;
import useful.random;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TheGame {
    public static void main(String[] args) {
        List<String> kelimeler = new ArrayList<>();
        String kelimeListesi = "Kitap, Defter, Kalem, Bilgisayar, Telefon, Araba, Ev, Şehir, Sokak, Okul, Öğrenci, Öğretmen, Anne, Baba, Kardeş, Çocuk, Genç, Yaşlı, Kadın, Erkek, Bebek, Elma, Portakal, Domates, Patates, Soğan, Su, Ekmek, Peynir, Et, Balık, Tavuk, Pilav, Makarna, Kahve, Çay, Şeker, Tuz, Para, Saat, Ayakkabı, Pantolon, Elbise, Gömlek, Tişört, Çanta, Kemer, Şapka, Güneş, Ay, Yıldız, Bulut, Deniz, Göl, Dağ, Orman, Çiçek, Kuş, Köpek, Kedi, At, Maymun, Fil, Kaplumbağa, Balık, Uçak, Tren, Otobüs, Bisiklet, Gemi, Hastane, Banka, Market, Restoran, Sinema, Müze, Cami, Kilise, Meydan, Park, Plaj, Havuz, Otogar, Havaalanı, Otoban, Köprü, Ev, Yatak, Masa, Sandalye, Dolap, Buzdolabı, Televizyon, Radyo, Fotoğraf, Film, Müzik, Dans, Spor, Sağlık.";
        String[] arr = kelimeListesi.split(", ");
        for (int i = 0; i < arr.length; i++) {
            kelimeler.add(arr[i]);
        }
        tekrar_oyna:
        while (true) {
            String kelime = useful.random.random_kelime(kelimeler);
            int tahmin_sayisi = 10;
            String[] kelimenin_harfleri = kelime.split("");
            List<String> bulunan_harfler = new ArrayList<>();
            for (int i = 0; i < kelimenin_harfleri.length; i++) {
                bulunan_harfler.add(i, "*");
            }
            while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("********************************************************************************************************");
                System.out.println("   Oyunu oynamak için harf girin. Kelimeyi bulduysanız bulunan kelimeyle boşluğu doldurun");
                System.out.println("********************************************************************************************************");
                System.out.println("                        Çıkmak için \"5\" beşe basınız!! ");
                System.out.println("********************************************************************************************************");
                while (true) {
                    System.out.print("Harf girin : ");
                    int tahmin_sayisi1 = 0;
                    String tahmin = scan.next();
                    if (kelime.equalsIgnoreCase(tahmin)) {
                        for (int i = 0; i<=5; i++) {
                            System.out.println();
                        }
                        continue tekrar_oyna;
                    }
                    else if (tahmin.length() == 1 & tahmin.contains(tahmin.toUpperCase()) || tahmin.length() == 1 & tahmin.contains(tahmin.toLowerCase())) {
                        for (int i = 0; i < kelimenin_harfleri.length; i++) {
                            if (kelimenin_harfleri[i].contains(tahmin.toUpperCase()) || kelimenin_harfleri[i].contains(tahmin.toLowerCase())) {
                                bulunan_harfler.set(i, kelimenin_harfleri[i]);
                            }else {
                                tahmin_sayisi1++;
                            }
                        }
                        if (tahmin_sayisi1 == kelimenin_harfleri.length){
                            tahmin_sayisi--;
                        }
                    }
                    System.out.println(bulunan_harfler);
                    System.out.println("Kalan tahmin sayısı : " + tahmin_sayisi);
                    if (tahmin_sayisi<=0) {
                        System.out.println("Tahmin sayınız bitti!! Yeniden deneyin!!");
                        System.out.println("Kelimeniz : "+kelime+"'idi");
                        for (int i = 0; i<=5; i++) {
                            System.out.println();
                        }
                        continue tekrar_oyna;
                    }
                    if (tahmin.contains("5")) {
                        break ;
                    }
                }
                break;
                //String keleime = kelimeler.get(random.nextInt(kelimeler.size()));
                //System.out.println(keleime);
                //int listSize = kelimeler.size();
                //// Rastgele bir indeks alalım
                //int randomIndex = random.nextInt(listSize);
                //// Rastgele seçilen elemanı yazdıralım
                //String randomElement = kelimeler.get(randomIndex);
                //System.out.println(randomElement);
            }
            System.out.println();
            System.out.println("Oyun kapatıldı!! Oynamak için yeniden başlatın!!");
            break;
        }
    }
}