package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek 1: verilen karakter buyuk harf ise ekrana "BUYUK HARF" yazdirin, kucuk harf ise "kucuk harf" yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char ch= input.next().charAt(0);

        //1.yol
        if (ch>='A' && ch<='Z'){
            System.out.println("BUYUK HARF");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("kucuk harf");
        }

        //2.yol
        if (ch>='A' && ch<='Z'){
            System.out.println("BUYUK HARF");
        }else if (ch>='a' && ch<='z'){
            System.out.println("kucuk harf");
        } else {
            System.out.println("harf degil");
        }
















    }
}
