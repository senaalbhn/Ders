package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
         Adana ==> Gecerli

         Passwordun ilk harfi kucuk harf ise
         'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
          zehirli ==> Gecerli
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String psw= input.nextLine();

        char first= psw.charAt(0);

        if (first>='A' && first<='Z'){
            if (first=='A'){
            System.out.println("gecerli password");
            }else {
                System.out.println("Gecersiz Password cunku buyuk harf ama A degil");
            }
        } else if (first>='a' && first<='z') {
            if (first=='z'){
            System.out.println("gecerli password");
            }else {
                System.out.println("Gecersiz Password cunku kucuk harf ama z degil");
            }
        } else {
            System.out.println("gecersiz");
        }


    }
}
