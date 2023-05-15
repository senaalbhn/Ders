package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz

        String s= "Shoes price is £150.";
        int sonuc= s.replaceAll("[0-9]","").length();
        System.out.println("sonuc = " + sonuc);

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String r= "summer is coming";
        String print =r.toUpperCase().substring(1,r.length()-1);
        System.out.println(print);

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        String u= "bjørnen sover";
        char firstCase = u.charAt(0);
        char secondCase= u.charAt(u.length()-1);
        System.out.println("toplam = " + (firstCase+ secondCase));

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //   console a yazdirin
        String city= "oSlo";
        String prnt=city.toUpperCase().charAt(0)+city.toLowerCase().substring(1);
        System.out.println(prnt);

        /* 5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
           a)En az 6 character olsun
           b)En az bir tane buyuk harf olsun
           c)En az bir tane kucuk harf olsun
           d)En az bir tane rakam olsun*/

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter password!");

        String psw= scan.next();
        System.out.println("Your password = " + psw);

        boolean first = psw.length()>5;
        System.out.println("Have at least 6 characters = " + first);
        boolean second = psw.replaceAll("^[A-Z]", "").length()>0;
        System.out.println("Have at least one capital letter = " + second);
        boolean third = psw.replaceAll("^[a-z]", "").length()>0;
        System.out.println("Have at least one lowercase letter = " + third);
        boolean fourth = psw.replaceAll("^[0-9]", "").length()>0;
        System.out.println("Have at least one digit = " + fourth);

        if (first&&second&&third&&fourth){
            System.out.println("Your password is valid.");}


        }
}
