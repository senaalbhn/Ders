package day04scannerwrapper;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Ornek1: Kullanicidan ilk ismini ve soy ismini alip ikisinini ayni satirda ekraana yazdiriniz
        //1. adim Skanner Classtan bir object olusturun

       // Class ismi obje ismi assigment operator new Class ismi
                Scanner input = new Scanner(System.in);
       // 2. adim: kullaniciya ne istedigimize dair mesaj verin
        System.out.println("ilk isminizi giriniz");
        // next methodu kullanicidan tek kelimelik string almak icin kullanilir
        // 3. adim: uygun methodu kullanarak kullanicinin verdigi datyi memorye yerlestiriniz
        String firstName=input.next();

        //4. adim:

        System.out.println("Soyisminizi giriniz");

        String lastName=  input.next();

        System.out.println(firstName+" "+lastName);
    }
}
