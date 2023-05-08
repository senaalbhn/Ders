package day03methodobjectcreationscanner;

//Javanin until kutuphanesinden scanner class import edildi
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1.Adim: scanner Class tan object olustur.

        Scanner input= new Scanner(System.in);

        //2. Adim: kullaniciya ne istediginize dair mesaj veriniz

        System.out.println("Lutfen yasinizi giriniz");

        //3.Adim: Uygun methodu kullanarak kullanicinin verdigi datayi memorye yerlestirir

        byte age = input.nextByte();
        System.out.println(age);

        System.out.println("age = " + age);

    }

}
