package day04scannerwrapper;

import java.util.Scanner;

public class Homework1Day04 {
        public static void main(String[] args) {

        //Homework1: Kullanicidan aldigimiz 3 tane sayinin ortalamasini bulan kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 3 adet sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber= input.nextDouble();
        double thirdNumber= input.nextDouble();

        System.out.println((firstNumber+secondNumber+thirdNumber)/3);







    }
}
