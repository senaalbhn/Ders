package day01variables;


public class Variables01 {
    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskalarina aciklamadir.
        /*
        bu bir ornek
        bu kadar
         */
        //Variable nasil olusturulur?
        // data type + +variable name + Atama Opeartor (Assigment Operatoru) + Variable degeri+ noktali virgul
        int              age                   =                                    13              ;

        //java cumlesi=> statement
        // Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gosterir.
        // Eger variable declaration yapar, Assigment yapmazsaniz java kendi default degerini koyar.
        // Default deger sayilar icin sifirdir.
        // Java da "=" assigment operator ve java operatoru gordugu zaman once sag tarafi calistirir.
        // ve sagdaki degeri alir soldaki kavanoza koyar.
        // Java da esittir demek ==> "=="  Matematikte "=" , Java da "=="
        //Data type + VariableName===> Variable declaration
        // Assigment operator (=) + Variable degeri ==> Assigment

        /*
        Java da temelde iki data type vardir;
        1) primitive data type:
        char, boolean, byte, short, int, long, floot, double
        sadece 8 tane
        2) non-primitive data type:
        String
        bir siniri, sayisi yok, surekli uretilebilir
         */
        // Ornek 1: ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi = "Ali Can" ;

        // Stringlere verilen degerler daima cift tirnak icinde olmalidir
        // Stringler icin defoult value(==> varsayilan deger) "null" dur
        /*
        String variable olusturdugumuzda cogu zaman ona bir deger atar. Atama yapmazsak java o variable icin varsayilan
        deger olarak null koyar
        *null demek 0 demek degildir, 0 da coding te bir degerdir, null ise hiclik demektir
        *null demek icinde variable veya method bulunmayan bos bir objedir
        *{}==>eleman yok    {0}==>elemani sifir
         */

        //char data type
        // tek karakter icin kullanilir. Sayi, sembol, harf farketmez
        // Ornegin==>A,X, 4,?, 13
        // Ornek 2 ==> char data type nda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A' ;

        //Note: char data type nda degerler tek tirnak icinde yazilir.


        //boolean data type:
        // booleanlar sadece iki farkli deger alabilir; True veya False
        // isimlendirme yapilirken basina is konulur
        //Ornek3: boolen data type inda emeklimisin sorusu icin bir variable olusturun ve folse degerini atayin

        boolean isRetired = false ;

        //byte data type
        //tam sayilar icindir.hafizada 1 byte yer kaplar
        //byte -128 den +127 ye (dahil) tamsayi degerleri icin kullanilir
        //Ornek4: byte data typen de ogrenci yasi icin bir variable olusturun ve deger atayin
        byte ogrenciYasi = 12;

        //short data type
        //tam sayilar icindir.hafizada 2 byte yer kaplar
        // range -32768den +32767 (dahil)tamsayi degerleri icin kullanilir
        //ornek5 site nufusu icin bir variable olusturun ve deger atayin

        short siteNufusu = 1300;

        //int data type
        //tam sayilar icindir.hafizada 4 byte yer kaplar
        // -2,147,483,648 ile +2,147,483,647 (dahil)
        // ornek 6 ulke nufusu icin bir variable olusturun ve deger atayin

        int ulkeNufusu = 520896205 ;

        //long data type:
        //tam sayilar icindir.hafizada 8 byte yer kaplar
        //ornek 7: insan vucudundaki hucre sayisi icin variable olusturup deger atayin

        long cellNumberInHumanBody = 3546646486797646L;

        //Note: Bir deger long ise sonuna "L" (kucuk l 1 sayisi ile karisabilecegi icin buyuk L tavsiye edilir)
        // veya "l" konulur
        long weigtOfSun = 1646546;
        //Eger longa atadiginiz deger int lerin araliginda ise sonuna L koymaya gerek yok.
        // Long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.

        //floot data type:
        // Ddecimal Numbers==> Ondalikli sayilar icin kullanilir (fiyatlandirmalar ==>12.99)
        // ornek8: gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99f;
        //Note: java ondalikli sayilari otomatik olarak double olarak kabul eder
        // Flout olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        //flout 4 byte yer kaplar

        //double data type
        //double memory de 8 byte yer kaplar. ondalikli kisim icin daha fazla rakam alir
        //ondalikli sayilar icin kullanilir
        //Ornek 9 hucre agirligi ve amipin agirli icin bir variable olusturunuz

        double weigtCell = 0.00000000000000064 ;
        double weightAmip = 0.00000000000000056 ;

        // ornek 10ogrenci notlari icin iki adervariable olusturunuz ve toplamlarini ekrana yazdiriniz

        //-----------------ekrana yazdirmak icin----------------------------
        System.out.println(5); //ekrana yazdirmak icindir
        System.out.println(15);  // ekrana yazdirir ve pointer i ayni satirda tutar
        //------------------------------------------------------------------

        byte note1= 55;
        byte note2= 33;
        System.out.println(note1+note2);

        //homework
        /*
        1) 3 farkli data turunde variable oluaturun ve bunlari farkli satirlarda yazdirin
        2) ulke ve sehir isinleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tam sayi turunde variable olusturun ve toplamini yazdirin

         */












    }

    }



