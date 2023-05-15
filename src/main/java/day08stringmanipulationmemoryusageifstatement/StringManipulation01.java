package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {

    public static void main(String[] args) {

        //Ornek1: bir stringim hic character icermedigini (bos string oldugunu) kontrol eden kodu yaziniz

        String str= "";

        //1.yol length() ile
        boolean result1= str.length()==0;
        System.out.println("String bos mu " + result1);


        //2.yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        boolean result2=str.isEmpty();
        System.out.println("is empty = " + result2);


        //Ornek 2: Bir Stringin space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String t= "     ";
        //1.yol
        boolean result3=t.replace(" ", "").length()==0;

        //2.yol
        boolean result4= t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3.yol
        boolean result5= t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.

        //Ornek3: bir striing de a, i, e characterlerinin ilk gorunumlerinin indexlerini ekrana yazdirin
        //"Java is easy to learn" ==>  1+5+8==>14
        // 0123456789.......

        String r= "Java is easy to learn";
        int indxA=r.indexOf('a');
        System.out.println(indxA);//1
        int indxI =r.indexOf('i');
        System.out.println(indxI);
        int indxE=r.indexOf('e');
        System.out.println(indxE);
        System.out.println(indxA+indxE+indxI);

        //Ornek4: Bir srtingdeki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu giriniz
        //"Ah Java vah Java sensiz olmuyor Java."

        String u ="Ah Java vah Java sensiz olmuyor Java.";
        int indJava= u.indexOf("Java");
        System.out.println(indJava);//3

        int indxjava = u.indexOf("java");
        System.out.println(indxjava);//-1

        //Ornek5 bir striing de a, i, e characterlerinin ilk gorunumlerinin indexlerini ekrana yazdirin

        String v= "Java is easy to learn";
        int lastA= v.lastIndexOf('a');
        int lastI= v.lastIndexOf('i');
        int lasrE= v.lastIndexOf('e');
        System.out.println(lastA+lasrE+lastI);

        /*
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);//String bos mu? true

        //2.yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? " + result2);//is Empty ? true

        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = "";
        //1. yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);

        //2. yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3. yol
        boolean result5 = t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA + idxE + idxI);//14

        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1


        //Ornek 5:  Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //          0123456789
        String v = "Java is easy to learn";

        int idxOfa=v.lastIndexOf('a');
        System.out.println(idxOfa);//18

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi=v.lastIndexOf('i');
        System.out.println(idxOfi);

        System.out.println(idxOfa+idxOfe+idxOfi);//40

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.
         */



















    }
}
