package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

/*
        1)"StringBuilder" classi da string ureten bir classdir.
        2)"String" Class kullanarak string uretiriz, nicin "StringBuilder" class'i da var?
            String Class immutable (degistirilemez) String uretir,
            "StringBuilder" class mutable( degistirilebilir) String uretir
        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir
         */

        //Immutable
        String s = "Java";
        String t = s+"!";
        String w = t+"?";
        //Stringi degistirdikten sonra ayni Stringe assign ederseniz, java yine yeni bir container olusturur
        //Degismid degeri bu yeni container in icinde koyar ve eski container i gosteren pointer yeni container a yonlendirilir
        //Dolayisiyla eski container adressiz kalir, ve garbage collector adressiz olan contanirlari siler
        String a = "Money";
        a=a+"More";

        //Mutable
        StringBuilder sb1= new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1);

        //StringBuilder kullanarak string uretmenin 2. yolu
        StringBuilder sb2= new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("Java");

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        //capacity() ve length() arasinda ki fark nedir?
        //capacity() javanin size verdigi data depolama yer sayisidir
        // length ise size verilen zdata depolama yerinin kullanilan kismidir
        //Java baslangic olarak size capacity' i 16 olarak verir, eger siz verilen capacity asarsaniz
        // java yeni capactiy'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        //16 ==> 16*2 +2            -     34 ==> 34*2+2


        //Default capacity i nasil degistirebiliriz
        StringBuilder sb3= new StringBuilder(3);
        sb3.append("ali");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());


    }
}
