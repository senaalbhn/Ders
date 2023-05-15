package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "learn Java earn money";
        //Ornek 1: "s" stringinin "money ile bitip bitmedigi kontrol edin
        boolean endsWithMoney = s.endsWith("money");
        System.out.println(endsWithMoney);//true

        //Ornek2: "s" stringindeki "money" kelimesini "dollar" kelimesine ceviriniz
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Ornek3:"s" stringindeki "earn" kelimesini "win" kelimesine ceviriniz
        String win= s.replace("earn", "win");
        System.out.println(win);//Lwin Java earn money

        String winDogruOlan= s.replace(" earn", " win");
        System.out.println(winDogruOlan);

        //Ornek4:"s" stringindeki tum a harflerini kelimesini * a ceviriniz
        String f= s.replace('a', '*');
        System.out.println(f);

        //Ornek5:"s" stringindeki tum n harflerini kelimesini xxx a ceviriniz
        String xxx=s.replace("n","xxx");
        System.out.println(xxx);

        //Ornek6:"s" stringindeki tum e harflerini siliniz
        String s5=s.replace("e", "");
        System.out.println(s5);

        String t= "Ali 13 yasindadir!...";
        //Ornek7: t stringindeki tum rakamlari "*" cevirin
        //Note: bir grup datayi ifade etmek icin 'regular -expressions' Regex kullaniriz

        String t1= t.replaceAll("[0-9]", "*");
        System.out.println(t1);


        /*
                        Meshur Regex
           1) Tum rakamlar ==> [0-9]
           2) Tum kucuk harfler ==> [a-z]
           3) Tum buyuk harfler ==> [A-Z]
           4) Tum kucuk ve buyuk harfler ==>[a -zA-Z]
           5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
           6) Tum noktalama isaretleri ==> \\p{Punct}
           7) Tum sesli harfler ==>[aeiouAEIOU]
           8) x,q,w ==> [xqw]
           9) Kucuk harflerden farkli tum characterler ==>[^a-z]
           10)Tum harflerden farkli tum characterler(tum buyuk harfler haric) ==>  [^a-zA-Z]

         */
    }
}
