package javaSoruBankasi;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //1) Tamsayılardan olusan b!r arrayde ortadak! elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

        int sayilar[]= new int[5];
        sayilar[0]= 5;
        sayilar[1]= 8;
        sayilar[2]= 12;
        sayilar[3]= 19;
        sayilar[4]= 89;


        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        if (sayilar.length%2==0){
            int ortadakiSayininIndeksi= sayilar.length/2;
            int ortadakiSayilarinToplami= (sayilar[ortadakiSayininIndeksi]+sayilar[ortadakiSayininIndeksi-1])/2;
            System.out.println(ortadakiSayilarinToplami);
        }else {
            int ortadakiSayi=sayilar.length/2;
            System.out.println(sayilar[ortadakiSayi]);
        }

        //2) Str!ng’ lerden olusan b!r arrayde uzunlugu en küçük olan elemanları bulunuz.
        //   Örnek: ( Kemal, Jonathan, Mark, Ang!e, Vel! ) ==> Output !s Mark, Vel!

        String names []= new String[5];
        names [0]= "Kemal";
        names [1]= "Jonathan";
        names [2]= "Mark";
        names [3]= "Angie";
        names [4]= "Veli";

        int min= names[0].length();
        for (String w: names){
            min= Math.min(min,w.length());
        }
        for (String w: names){
            if (min==w.length()){
                System.out.println(w);
            }
        }

        //3) Tamsayılardan olusan b!r arrayde en küçük poz!t!f elemanı ve en büyük negat!f elemanı bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük poz!t!f 18, en büyük negat!f -2

        int tam []= new int[5];
        tam[0]=-12;
        tam[1]= 18;
        tam[2]= -5;
        tam[3]= 23;
        tam[4]= -2;

         Arrays.sort(tam);

        int minPozitif= tam[tam.length-1];
        int maxNegatif= tam[0];

        for (int w: tam){

            if(w>=0){
                minPozitif= Math.min(minPozitif,w);
            }else {

                maxNegatif= Math.max(maxNegatif,w);
            }
        }
        System.out.println("minPozitif = " + minPozitif + "  maxNegatif = " + maxNegatif);

        System.out.println(Arrays.toString(tam));

        for (int i=0; i<tam.length; i++){

            if (tam[i]<0 && tam[i+1]>0){
                System.out.println("Pozitif min = " + tam[i+1]);
                System.out.println("Negatif max = " + tam[i]);
            }
        }

        //4) String’ lerden olusan bir arrayde ögeler 'n' veya 'k' ile bitiyorsa, o ögelerin bas harflerini alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Al!” } ==> Çıktı JJM

        String isim[]= new String[5];
        isim [0]= "Kemal";
        isim [1]= "Jonathan";
        isim [2]= "Mark";
        isim [3]= "Jackson";
        isim [4]= "Ali";
        String basHarf="";
        for (String w: isim){
            if (w.endsWith("n") || w.endsWith("k")) {
                basHarf=basHarf+w.charAt(0);
            }
        }
        System.out.println(basHarf);

        //5) Str!ng’ lerden olusan b!r arrayde kullanılan ögeler!n toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Ang!e", "Vel!" } ==> Çıktı 26

        String name []= new String[5];
        name [0]= "Kemal";
        name [1]= "Jonathan";
        name [2]= "Mark";
        name [3]= "Angie";
        name [4]= "Veli";

        int toplam= 0;
        for (String w: name ){
            toplam=toplam+w.length();
        }
        System.out.println(toplam);

        //6) Verilen bir String'de 'a' veya 'A' !le baslayan kelime sayısını bulunuz.

        String a= "Apex is an object oriented programming language";
        String arr[] = a.split(" ");
        int counter=0;
        for (String w: arr){
            if (w.startsWith("a")  ||  w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);

        //7) Ver!len b!r Str!ng'dek! sesl! harf sayısını bulunuz.
        //1.yol String manipulation ile
        String newA=a.toLowerCase().replaceAll("[^a,e,u,i,o]","");
        System.out.println(newA.length());
        //2. yol Array ile
        String[] brr= a.toLowerCase().split("");
        int sayac=0;
        for (String w: brr){
            switch (w){
                case "a":
                case "e":
                case "u":
                case "i":
                case "o":
                    sayac++;
            }
        }
        System.out.println(sayac);

        //8) Ilk ve son karakterler! aynı olan array ögeler!n! bulmak !ç!n kod yazınız.
        String[] ar = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (String w:ar){

            if (w.charAt(0)==w.charAt(w.length()-1)) {
                System.out.println(w);
            }
        }

        //9) Ver!len b!r Str!ng arraydek! bel!rl! b!r ögen!n var olup olmadıgını bulmak !ç!n kod yazınız.
        String crr[]= new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String el= "object";
        int syc=0;

        for (String w: crr){
            if (w.equals(el)){
                syc++;
                break;
            }
        }
        if (syc>0){
            System.out.println(el+" kelimesi Array de bulunmaktadir ");
        } else {
            System.out.println(el+" kelimesi Array de yoktur ");
        }

        //10) Ver!len b!r Str!ng arraydek! ögeler!n karakterler!n!n toplamını bulmak !ç!n kod yazınız.
        int sonuc=0;
        for (String w: ar){
            sonuc=sonuc+w.length();
        }
        System.out.println(sonuc);

        //11) Tamsayılardan olusan arrayde bulunan sıfırları, array sonuna yerlest!ren kod yazınız.
        //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int nums[]= new int[]{5, 0, 2, 0, 3};
        int yeniNums[]= new int[nums.length];
        int idx=0;

        for (int w: nums){
            if (w!=0){
                yeniNums[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeniNums));

        //12) Kullanıcıdan aldıgınız tamsayılar !le b!r array olusturunuz ve bu arraydek! en küçük ve en
        //büyük ögeler arasındak! farkı konsolda yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gireceginiz sayi miktarini giriniz");
        int arrayUzunkugu= scan.nextInt();
        int [] numbers= new  int[arrayUzunkugu];
        System.out.println("Girilecek sayi miktari: "+arrayUzunkugu);
        for (int i=0; i<arrayUzunkugu; i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("En buyuk ve en kucuk sayinin farki: " +( numbers[numbers.length-1] - numbers[0]));

        //13) Kullanıcıdan 2 Str!ng g!rmes!n! !stey!n!z. Str!ngler!n karakterler! ve karakter sayıları aynıysa
        //konsola "Anagramdır" yazdırın. Aks! takd!rde, konsolda "Anagram Deg!l" yazdırınız.
        //Örneg!n; "Mary" ve "army" ve "RAMY" Anagramlardır.

        System.out.println("Lutfen iki kelime giriniz");
        String w1=scan.next();
        String w2=scan.next();
        String [] arr1=w1.toLowerCase().split("");
        String [] arr2=w2.toLowerCase().split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (w1.length()!=w2.length()){
            System.out.println("Anagram degildir");
        } else if (w1.isEmpty() || w2.isEmpty()){
            System.out.println("Degildir");
        }else if (Arrays.equals(arr1,arr2)) {
            System.out.println("yes it is");
        } else {
            System.out.println("No, it is not");
        }






    }
}
