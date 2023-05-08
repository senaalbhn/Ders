package day02datatypesmethodcreation;

public class Tekrar01 {


    /*
    *Main medhodu icine ayni isimli sadece bir variable olusturabiliriz. eger olusturdugumuz variablenin variable degerini degistirmek
    istersek bunun icin data type yazmadan direk variable ismini yazip assigmen operatoru (=) yazip yeni variable degerini yaziyoruz sonrada ; koyuyoruz.
    boylece variable degeri degistirilmis oluyor.

    * String cityName= "Ankara";
        cityName= "Izmir";
        System.out.println(cityName);
     */

    /* Non-primitive data typleri ve Primitive data typeri arasindaki farklar nelerdir?
    1) NP'leri java ve java developerlar olusturur, P'leri java olusturmustur
    2) Np'lerin sayisi sinirsizdir ama P'ler sadece 8 tanedir.
    3) P'lerin memoryde kapladigi alan bellidir ama NP'ler memory de buyuklugune gore farkli alan kaplar
    4) P'ler kucuk harfle baslar, NPler buyuk harfle baslar
    5) P'lerin icinde sadeve bizim atadigimiz degerler vardir, NP'lerin icinde atadigimiz degerler ve methodlar vardir.
    6) Her NP ayni zamanda bir classdir.
     */

    /*Method nasil olusturulur?
    accsess modifier+ static+ return type+ method name+ ()+{}
     */

    public static void main(String[] args) {
        // Ornek1: Sehir ismi icin bir variable olusturun ve once "Ankara" sonra "Izmir" degerlerini atayip ekrana yazdirin
        String cityName= "Ankara";

        cityName= "Izmir";
        System.out.println(cityName);

        // Ornek2: Sehir plaka kodu icin bir variable olusturun once 34 sonrada 35 degeri atayip colsole yazdirin
        byte plakaKodu= 34;

        plakaKodu=35;
        System.out.println(plakaKodu);

        //Ornek3: Basarili mi sorusu icin bir variable olusturun ve once false sonra true degeri atayip ekrana yazdirin
        boolean isSuccessful= false;

        isSuccessful= true;
        System.out.println(isSuccessful);

        //Ornek1: Ulke ismi icin bir variable olusturun ve bir deger atayip konsola yazdirin

        String countryname= "Norway";
        System.out.println(countryname);

        //Method Creation

        //Ornek1:toplama islei yapan  bir method olusturun ve kullaniniz
         int toplamasonuc= toplama(2,3);
        System.out.println(toplamasonuc);

        //Ornek2: 2 sayiyi carma islemi yapan bir mathod olusturun ve kullanin
        int multipysonuc= multipy(4,5);
        System.out.println(multipysonuc);

        //Ornek3: veriler 3 sayidan ilk ikisini carpin ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin
        int sonuc= (firstTwomultipyThirtAdd(4,5,6));
        System.out.println(sonuc);





    }
    //Ornek1:
    public static int toplama(int a, int b){
        return a+b;
    }

    //Ornek2:

    protected static int multipy ( int a, int b){
        return a*b;
    }

    //Ornek3:
    private static int firstTwomultipyThirtAdd(int a, int b, int c){
        return a*b+c;
    }



    //Soru: primitive ve non-primitive data typler arasindaki farklar nelerdir?



    /*
    1) diktortgenin alanini hesaplayan methodu olusturun ve kullanin
    2) diktortgenin cevresini hesaplayan methodu olusturun ve kullanin
     */




}
