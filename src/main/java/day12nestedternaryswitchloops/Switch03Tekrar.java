package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03Tekrar {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz sayilari giriniz");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        System.out.println("Lutfen yapmak istedigi iz islemi seciniz: +, -, *, /, %");
        char islem= scan.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + ((a*b)/100));
                break;
            default:
                System.out.println("Isleminiz gecersizdir.Lutfen tekrar deneyin");

        }

























    }
}
