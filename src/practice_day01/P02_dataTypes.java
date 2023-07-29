package practice_day01;

public class P02_dataTypes {
    public static void main(String[] args) {
        /*
        byte : sadece tam sayı - hafızada 8 bit yer kaplar
        short : sadece tam sayı - hafızada 16 bit yer kaplar
        int : sadece tam sayı - hafızada 32 bit yer kaplar
        long :sadece tam sayı - hafızada 64 bit yer kaplar

        flot: ondalıklı sayıları ifade eder (sonunda f yazmak zorunludur)
        double : ondalıklı sayıları ifade eder (sonunda d yazmak zorunlu değilidir)
        büyüklüklerine göre: byte/short/int/long/float/double
        boolean : true yada false
        char : tek tırnak içinde yazılır karakter alır ascii tırnak içinde yazılmaz

         */
        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;
        System.out.println("Byte Max. Değer = " + b1);
        System.out.println("Byte Min. Değer = " + b2);

        short s1 = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("Short Max. Değer = " + s1);
        System.out.println("Short Min. Değer = " + s2);

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        System.out.println("int Max. Değer = " + i1);
        System.out.println("int Min. Değer = " + i2);


        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;
        System.out.println("long Max. Değer = " + l1);
        System.out.println("long Min. Değer = " + l2);

        float f1 = Float.MAX_VALUE;
        float f2 = Float.MIN_VALUE;
        System.out.println("Float Max. Değer = " + f1);
        System.out.println("Float Min. Değer = " + f2);

        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        System.out.println("Double Max. Değer = " + d1);
        System.out.println("Double Min. Değer = " + d2);

        /*
        nonPrimitive data türleri çok fazladır
        String şu an sadece bildiğimiz
        özelliklerli karakter sınırı yoktur

         */

        String isim="Mehmet";
        char giris='m';
        System.out.println("isim = "+isim);
        System.out.println("giris = "+giris);
        System.out.println(isim.charAt(3));





    }
}
