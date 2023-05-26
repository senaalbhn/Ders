package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01Tekrar {
    public static void main(String[] args) {
        /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girin");
        String gender= input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte age= input.nextByte();

        if (age<0 || age>120){
            System.out.println("Lutfen 0 ile 120 arasinda bir sayi giriniz");
        } else if (gender.equalsIgnoreCase("kadin")){
            if ( age>60) {
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calismali");
            }
        } else if ( gender.equalsIgnoreCase("erkek")) {
            if ( age>65) {
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calismali");
            }
        } else {
            System.out.println("Lutfen kadin veya erkek yaziniz");
        }


    }
}
