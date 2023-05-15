package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
          /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //  1) En az 8 character olsun
        boolean first = pwd.length() > 7;
        System.out.println("En az 8 karakter var mi  " + first);

        //2) Space character i password de olmasin
        boolean second = !pwd.contains(" ");

        // 3) En az bir buyuk harf olsun
        /* Note: 1. Buyuk harf olmayanlari silin
                 2. Kalan karakter sayisina bak
                 3. Charcter sayisi 0 dan buyukse buyuk harf var demektir
                 4. Character sayisi 0 ise buyuk sayi yoktur
         */
        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("En az bir buyuk harf var mi = " + third);

        //Methodlari ayni satirda yanyana kullanmaya method chain denir

        //4) En az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("En az bir kucuk harf var mi = " + fourth);

        //5) En az bir rakam olsun

        boolean fifth = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("En az bir rakam var mi = " + fifth);

        System.out.println("password gecerli mi = " + (first && second && third && fourth && fifth));




    }
}
