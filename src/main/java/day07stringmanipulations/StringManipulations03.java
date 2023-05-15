package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek1: bir string bas ve sonunda space cracteri varsa siliniz
        //"    Ali Can   " ==> "Ali Can"
        //trim() methodu bir stringin bas ve sonundaki space karakterlerini siler, aradaki spacelere dokunmaz

        String s= "   Ali Can  ";
        String sTrim= s.trim ();
        System.out.println(s);
        System.out.println(sTrim);

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        // String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99+875.99 0 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2=tv.replace("$","");
        System.out.println("TV price:   " + tv2);

        String laptop2= laptop.replace("$", "");
        System.out.println("Laptop price: " + laptop2);

        double totalprice= Double.valueOf(tv2)+ Double.valueOf(laptop2);
        System.out.println("Total price: " + totalprice);

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy ismin ilk harfini ekrana yazdirin
        //"  Ali Can   " ==> AC

        //DIKKAT DIKKAT; split methodu hangi karakterden boluyorsa o karakteri yok eder

        String name = "    ali cAn  ";
        char first =name.trim().toUpperCase().charAt(0);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println(""+first+" "+last);

        char deneme =name.trim().toUpperCase().replace("ALİ ","").charAt(0);
        System.out.println(deneme);
    }
}
