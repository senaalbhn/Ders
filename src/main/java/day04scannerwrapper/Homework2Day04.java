package day04scannerwrapper;

import java.util.Scanner;

public class Homework2Day04 {
    public static void main(String[] args) {

        //Homework2: kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int number = input.nextInt();

        int sonBasamak = number % 10;
        number = number / 10;

        int ortancaBasamak = number % 10;
        number = number / 10;

        int ilkBasamak = number % 10;

        System.out.println("Yazdiginiz sayinin rakamlari toplami = " + (ilkBasamak+ortancaBasamak+sonBasamak) );

    }
}
