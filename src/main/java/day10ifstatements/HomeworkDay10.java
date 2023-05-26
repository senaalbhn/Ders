package day10ifstatements;

import java.util.Scanner;

public class HomeworkDay10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
        //ve kullaniciya uygun mesaj veren kodu yaziniz

        System.out.println("Lutfen sifrenizi giriniz");
        String psw = input.nextLine();

        if (psw.equals("pwd123!")) {
            System.out.println("Gecerli sifre");
        } else {
            System.out.println("Gecersiz sifre");
        }

        //2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
        //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....


        System.out.println("Lutfen hangi gun oldugunu yaziniz...");
        String day = input.nextLine();

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("1.gun");
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("2.gun");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("3.gun");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("4.gun");
        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("5.gun");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("6.gun");
        } else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("7.gun");
        } else {
            System.out.println("Gecersiz giris yaptiniz. Lutfen tekrar deneyin... ");
        }

        //3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....

        System.out.println("Lutfen kacinci ay oldugunu yaziniz...");
        byte month= input.nextByte();

        if (month == 1){
            System.out.println("Ocak");
        } else if (month == 2) {
            System.out.println("Subat");
        } else if (month == 3) {
            System.out.println("Mart");
        } else if (month == 4) {
            System.out.println("Nisan");
        }else if (month == 5) {
            System.out.println("Mayis");
        } else if (month == 6) {
            System.out.println("Haziran");
        } else if (month == 7) {
            System.out.println("Temmuz");
        }else if (month == 8) {
            System.out.println("Agustos");
        } else if (month == 9) {
            System.out.println("Eylul");
        } else if (month == 10) {
            System.out.println("Ekim");
        }else if (month == 11) {
            System.out.println("Kasim");
        } else if (month == 12) {
            System.out.println("Aralik");
        } else {
            System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz");
        }
    }
}
