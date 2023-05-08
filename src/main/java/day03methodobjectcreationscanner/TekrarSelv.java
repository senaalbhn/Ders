package day03methodobjectcreationscanner;

public class TekrarSelv {

    public static void main(String[] args) {

        double resultCube = getCube(5);
        System.out.println(resultCube);

        long carpmaSonuc= carpma(4,7);
        System.out.println("carpmaSonuc = " + carpmaSonuc);

        print("uras balli borek");
        bas("Uras uyuyor");

        yazdir ("uyku vakti");

        String str1 = "uras bebek kus";
        console (str1);

        topla (5,4);

        //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        carp (8,9);

        int d=7;
        int b=6;
        islem (d,b);

        int sayi= 3;
        kupunual (sayi);




    }

    private static void console(String str1) {
        System.out.println(str1);
    }

    private static void kupunual(int sayi) {
        System.out.println(sayi*sayi*sayi
        );
    }

    private static void islem(int d, int b) {
        System.out.println(d*b);
    }


    private static void carp(int i, int i1) {
        System.out.println(i*i1);
    }

    private static void topla(int i, int i1) {
        System.out.println(i+i1);
    }

    private static void yazdir(String uykuVakti) {
        System.out.println("not = " + uykuVakti);
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.

    public static double getCube (double a){
        return a*a*a;
    }

    static long carpma ( int c, int v){
        return c*v;
    }

    public static void print (String str){
        System.out.println("str = " + str);
    }
    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
     static void bas(String str){
         System.out.println(str);
     }
}
