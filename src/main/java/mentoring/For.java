package mentoring;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        /*Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar return eden metod yaziniz
         ornek:  input        output
            elma  2           eaea
            army  3           ayayay */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String fruit= input.next();
        System.out.println("Lutfen bir sayi giriniz");
        int num=input.nextInt();

        String f1= fruit.substring(0,1);
        String f2= fruit.substring(fruit.length()-1);
        String f3= f1+f2;
        for (int i = 0; i < num+1 ; i++) {
            System.out.print(f3);
        }









    }
}
