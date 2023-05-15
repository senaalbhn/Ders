package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bie non-primitive data type dir ve ayni zamanda bir class dir.

        String s = "Java is easy";
        System.out.println(s);//Java is easy

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        String uras = "uras is very cute";
        System.out.println(uras);//uras is very cute
        String urasUpper = uras.toUpperCase();//URAS İS VERY CUTE
        System.out.println(urasUpper);

        //Ornek2: "s" Stringindeki tum characterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek3: "s" Stringindeki ilk characterleri aliniz
        char firstsChar = s.charAt(0);
        System.out.println("firsts Char is  = " + firstsChar);

        char dene = s.charAt(6);
        System.out.println(dene);

        //Ornek2: "s" Stringindeki bastan ikinci ve sondan ikinci characterleri yazdiriniz

        char secondCase = s.charAt(1);
        char tenCase = s.charAt(10);
        System.out.println("Second Case: " + secondCase + " and " + "Tenth Case: " + tenCase);
        System.out.println(secondCase + tenCase);// 212
        System.out.println("" + secondCase + tenCase);// as

        //Ornek 5: "s" string inde kullanilan character sayisini bulunuz

        int sLength = s.length();
        System.out.println(sLength);//12

        //Ornek 6: "s" stringindeki ilk dort characteri aliniz
        String sub1 = s.substring(0, 4);
        System.out.println("Sub1 = " + sub1);

        //Ornek 6: "s" stringindeki "is"" characteri aliniz
        String sub2 = s.substring(5, 7);
        System.out.println("Sub2 = " + sub2);

        //Ornek 6: "s" stringindeki "easy"" characteri aliniz
        String sub3 = s.substring(8, 12);
        System.out.println("sub3 = " + sub3);

        //ikinci yol:
        String easy = s.substring(8);
        System.out.println(easy);

        //Ornek 9: "s" stringindeki "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        boolean varMi = s.contains("easy");
        System.out.println(varMi);//true

        boolean buyukKucukHarfOrnegiIcin = s.contains("java");
        System.out.println(buyukKucukHarfOrnegiIcin);//false

        boolean buyukKucukHarfOrnegiIcin2 = s.contains("Java");
        System.out.println(buyukKucukHarfOrnegiIcin2);//true

        boolean hiclik = s.contains("");
        System.out.println(hiclik);//true

        boolean bosluk = s.contains(" ");
        System.out.println(bosluk);//true

        //Ornek 10: "s" stringinin belirli bir harf ile baslayip baslamadigini kontrol ediniz

        boolean isStartWithA = s.startsWith("a");
        System.out.println(isStartWithA);//false

        boolean kucukJ = s.startsWith("j");
        System.out.println(kucukJ);//false

        boolean buyukJ = s.startsWith("J");
        System.out.println(buyukJ);//true

        boolean kelimedeOLur = s.startsWith("Java");
        System.out.println(kelimedeOLur);//true

        //Ornek 11: "s" stringinin 5. index dahil olmak uzere bu indexten itibaren i karakteri ile baslayip baslamadigi kontrol ediniz

        boolean isExistI = s.startsWith("i", 5);
        System.out.println(isExistI);//true

        boolean isExistV = s.startsWith("v", 2);
        System.out.println(isExistV);//true


    }
}
