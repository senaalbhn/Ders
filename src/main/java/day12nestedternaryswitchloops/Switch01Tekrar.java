package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch01Tekrar {
    public static void main(String[] args) {

        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sectiginiz gunleri yaziniz");
        String day1= scan.next();
        String day2= scan.next();

        switch (day1.toLowerCase()){
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun yaziniz");
                break;
        }

        switch (day2.toLowerCase()){
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun yaziniz");

        }
















    }
}
