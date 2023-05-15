package day05concatinationoperatorstypecasting;

public class AsciiValues {
    /*
    java da her karakterin sayisal bir degeri vardir
    bu degerle ASCII degerler olarak adlandirilir
    bu degerlerin tamaminin bulundugu tabloyu ASCII Table denir
     */

    public static void main(String[] args) {

        char a= 'a';
        System.out.println(a);
        //herhangi bir karakterin ascii degerini bulmak icin o karakteriint data type nda bir variable icine koyunuz
        int inta= 'a';
        System.out.println(inta);
        byte unlem = '!';

        int uras1= 'u';
        int uras2= 'r';
        int uras3= 'a';
        int uras4= 's';
        System.out.println("urasin harfleri toplami = " + (uras1+uras2+uras3+uras4));

        char c1= 'k';
        char c2= '?';
        System.out.println(c1+c2);//138
        //java da charlari matematiksel islemlerle kullanirsaniz java charlarin ASCII degerlerini kullanilir





    }


}
