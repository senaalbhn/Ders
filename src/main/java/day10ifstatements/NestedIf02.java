package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
         /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane sayi giriniz");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

        boolean ucgenMi = a + b > c && c > Math.abs(a - b) &&
                          a + c > b && b > Math.abs(a - c) &&
                          b + c > a && a > Math.abs(b - c);

        if (a<=0 || b<=0 || c<=0){
            System.out.println("Gecerli kenar uzunlugu giriniz");
        }else if (ucgenMi){
            if(a==b && b==c){
                System.out.println("Eskenar ucgen");
            }  else if (a==b || b==c || c==a) {
                System.out.println("Ikiz kenar ucgen");
            }else {
                System.out.println("Cesit kenar ucgen");
            }
        }else {
            System.out.println("Ucgen degil");
        }

    }
}
