package day01variables;

public           class TekrarDay01 {
    public static void main(String[] args) {

        /* Variable olusturma==>

        data type+ variable name + assigment operator (=)+ Variable degeri+ ;
        ------------------------    ------------------------------------
         variable declaration    +          assigment                       ==> statement

         Data Type
         1) Primitive                            2)Non-primitive
         * char: '', tek karakter                 * string: ""
         * boolean: T or F
         * byte:-128-+127 , 1 byte
         * short:-32768 - +32767, 2 byte
         * int:-2,147,483,648 - +2,147,483,647, 4 byte
         * long: 8 byte, sonuna L veya l
         * float: Decimal Numbers, sonuna F veya f, 4 byte
         * double: Decimal Numbers ama ondalik kisminda daha fazla rakam, 8 byte

         */

        /*
        Yazdirma:

         System.out.println(5);   ==> ekrana yazdirmak icindir
         System.out.println(15);  ==> ekrana yazdirir ve imleci ayni satirda tutar

         System.out.println(note1+note2); ==> toplama islemi
         */

        // Ornek1: ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        String nameOfStudent= "Ali Can";
        // Ornek2: char data type nda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'u';
        // Ornek3: boolen data type inda emeklimisin sorusu icin bir variable olusturun ve folse degerini atayin
        boolean isRetiret= false;
        // Ornek4: byte data typen de ogrenci yasi icin bir variable olusturun ve deger atayin
        byte ageOfStudent= 29;
        // Ornek5: site nufusu icin bir variable olusturun ve deger atayin
        short populationOfSite = 25896;
        // Ornek6: ulke nufusu icin bir variable olusturun ve deger atayin
        int populationOfNorway= 55899412;
        // Ornek7: insan vucudundaki hucre sayisi icin variable olusturup deger atayin
        long cellNumberInHumanBody= 3599966554411631L;
        // Ornek8: gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz
        float priceOfSkirt= 19.85F;
        float priceOfShoes= 9.99F;
        // Ornek9: hucre agirligi ve amipin agirli icin bir variable olusturunuz
        double weightOfCell = 0.000000005;
        double weightOfAmip = 0.000000007;


    }
}
