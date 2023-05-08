package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz bes basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin
        //toplamini yazdiran kodu yaziniz

        Scanner input= new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi ona bolup kalani aliriz
        // bir tam sayiyi bir tam sayiya bolersiniz java sonucu kesinlikle tam sayi yapar

        //bir sayinin son rakamini alabilmek icin o sayiyi ona bolup kalani almaliyiz
        // % ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //dolayisiyla %10 dersek her zaman birler basagiminda olan sayiyi verir.
        //bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle tam sayi yapar.
        //Ondalik kismi ispal eder. java yuvarlama yapmaz
        //dolayisi ile bir sayiyi 10 a bolersek birler basamagini silmis oluruz

        //son rakami al
        //38671
        int birlerBasamagi= number%10;
        //sayi kucult
        number=number/10;
        //sondan ikinci rakami al
        int onlarBasamagi= number%10;
        //sayi kucult
        number=number/10;

        //sondan ucuncu rakam
        int yuzlerBasamagi= number%10;
        number=number/10;

        //sondan dorduncu
        int binlerBasamagi= number%10;
        number=number/10;

        //sondan besinci
        int onbinlerBasamagi= number%10;

        System.out.println(birlerBasamagi+onlarBasamagi+binlerBasamagi+onbinlerBasamagi);




    }
}
