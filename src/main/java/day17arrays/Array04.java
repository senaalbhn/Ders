package day17arrays;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";

       String word []= s.split(" ");
        System.out.println(Arrays.toString(word));
        System.out.println(word.length);

        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String letters[]= s.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);















    }
}
