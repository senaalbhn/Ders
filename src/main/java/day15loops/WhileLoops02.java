package day15loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*          3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30*/

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num= input.nextInt();

        int i=1;
        while (i<11){

            System.out.println(num+ "x"+ i +"="+(num*i));

            i++;
        }

        //Example 2: Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz
        //      Java  ==> J*a*v*a*
        System.out.println("Lutfen bir kelime giriniz");
        String word=input.next();
        String newWord= "";

        int k=0;
        while ( k<word.length()){

            newWord= newWord+ word.charAt(k)+"*";

            k++;
            System.out.println(newWord);
        }

        System.out.println();

        //Example 3: Bir string deki tekrarsiz karakterleri console a yazdiriniz
        // kertenkelle  ==> rtn
        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

       String s= "kertenkelle";
       String sonuc= "";

       int a=0;

       while (a<s.length()){

           char ch= s.charAt(a);
           if ( s.indexOf(ch)==s.lastIndexOf(ch)){
               sonuc= sonuc+ch;
           }
           a++;
       }
        System.out.println(sonuc);






















    }
}
