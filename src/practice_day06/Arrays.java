package practice_day06;

public class Arrays {
    public static void main(String[] args) {
        int [] list={1,3,12,25,56,35,89};
        int toplam= 0;
        for (int i = 0; i < list.length; i++) {
            toplam+=list[i];



        }
        System.out.println("arrayın toplamı: " +toplam);
    }


}
