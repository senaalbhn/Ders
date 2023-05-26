package day17arrays;

import java.util.Arrays;

public class Array01Tekrar {
    public static void main(String[] args) {

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int numbers[]={5,7,9,1,4,6,12,48, 75,63 ,89,56};
        int counter=0;

        for (int w: numbers){
            if (w%2==0){
                counter++;
            }
        }
        System.out.println(counter+" "+(numbers.length-counter));

        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz

        String names[]={"uras", "sena", "ramazan", "susam"};

        for (String w: names) {
            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        for (String w: names){
            if (w.startsWith("s")){
                continue;
            }else {
                System.out.println(w);
            }
        }























    }
}
