package useful;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class random {
    public static String random_kelime(List<String> list){
        Random random = new Random();
        List<String> list1 = new ArrayList<>(list);
        int listSize = list1.size();
        // Rastgele bir indeks alalım
        int randomIndex = random.nextInt(listSize);;
        // Rastgele seçilen elemanı yazdıralım
        String randomElement = list.get(randomIndex);
        return randomElement;
    }
    public static int random_sayi(List<Integer> list){
        Random random = new Random();
        List<Integer> list1 = new ArrayList<>(list);
        int listSize = list1.size();
        // Rastgele bir indeks alalım
        int randomIndex = random.nextInt(listSize);;
        // Rastgele seçilen elemanı yazdıralım
        int randomElement = list.get(randomIndex);
        return randomElement ;
    }
    //useful.random.random_kelime(kelimeler);
    //String keleime = kelimeler.get(random.nextInt(kelimeler.size()));
    //System.out.println(keleime);
    //int listSize = kelimeler.size();
    //// Rastgele bir indeks alalım
    //int randomIndex = random.nextInt(listSize);
    //// Rastgele seçilen elemanı yazdıralım
    //String randomElement = kelimeler.get(randomIndex);
    //System.out.println(randomElement);
}