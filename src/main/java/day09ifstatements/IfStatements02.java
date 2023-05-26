package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Ornek1: Kullanicidan aldiginiz bir sayinin tek mi cift mi oldugunu konsola yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num=input.nextInt();
        //1.yol

        if( num%2==0){
            System.out.println("Cift sayidir");}

        if (num%2!=0){
            System.out.println("Tek sayidir");}
        //2.yol

        if (num%2==0){
            System.out.println("Cift sayidir");}
        else{System.out.println("Tek sayidir");}









    }



}
