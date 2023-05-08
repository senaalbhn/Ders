package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        //a) alanini hesaplayiniz
        //b) cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");

        double uzoKenar= input.nextDouble();

        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz");
        double kisaKenar= input.nextDouble();

        System.out.println("Alan= " + (uzoKenar*kisaKenar));
        System.out.println("Cevre= " + (2*(uzoKenar+kisaKenar)));
    }
}
