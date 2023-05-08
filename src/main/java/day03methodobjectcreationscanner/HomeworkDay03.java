package day03methodobjectcreationscanner;

public class HomeworkDay03 {
    public static void main(String[] args) {
        //1: Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        double cevreSonuc = cemberinCevresi(2, 3.14, 6);
        System.out.println("DaireninCevresi = " + cevreSonuc);

        //2: Dairenin alanini gesaplayan methodu olusturunuz ve kullaniniz
        double pi = 3.14;
        double r = 6;
        alanDaire((pi * r) * (pi * r));
    }

    public static double cemberinCevresi(double a, double pi, double r) {
        return a * pi * r;
    }

    private static void alanDaire(double v) {
        System.out.println("DaireninAlani = " + v);
    }
}
