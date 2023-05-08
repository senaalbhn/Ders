package day02datatypesmethodcreation;

public class Homework02 {
    public static void main(String[] args) {
         /*
    1) diktortgenin alanini hesaplayan methodu olusturun ve kullanin
    2) diktortgenin cevresini hesaplayan methodu olusturun ve kullanin
     */

        int alansonuc= diktortgenalani(10,8);
        System.out.println(alansonuc);

        int cevresonuc= diktortgencevresi(10,8,2);
        System.out.println(cevresonuc);
    }

    public static int diktortgenalani( int uzunkenar, int kisakenar){
        return kisakenar*uzunkenar;
    }
    protected static int diktortgencevresi (int uzunkenar, int kisakenar, int a){
        return a*(uzunkenar+kisakenar);

    }
}
