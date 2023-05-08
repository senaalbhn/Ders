package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("java is easy");

        String str = "Uras Cok Tatli";
        printtahta (str);

        int a=3;
        int b=5;
        carpmaYap(a,b);

        int c=5;
        karesiniHesapla (c);

        //Ornek 3 verilen iki tam sayiyi carpan ve sonucu yazdiran methodu olusturup kullaniniz
        int s=2;
        int r=5;
        carpma (s,r);

    }

    private static void carpma(int s, int r) {
        System.out.println(s*r); }

    private static void printtahta(String str) {
        System.out.println(str);
    }

    public static void karesiniHesapla(int c) {
        System.out.println(c*c);
    }

    private static void printConsole(String str) {
    }

    private static void carpmaYap(int a, int b) {
    }
    //Ornek1: verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.

    static double getCube( double a){
        return a*a*a;
    }
    // Eger access modifier i default yapmak isterseniz access modifier i YAZMAYIN...

    //Ornek2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz

    public static void print (String str){
        System.out.println(str);
    }
    // Eger bir method yeni bir daha uretmiyor ise return type i void olur.
    // Eger bir methodun returd type i void ise method body nin icine return reywordu yazilmaz

    //method olusturmak icin ikinci yol
    //Ornek2 ikinci yol: girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    // main method icinde iken method ta kullanilacak olan variable lari olusturunuz
    String str = "TechProEdu";
    //method ismi ve parametreri yazariz
    //kirmizi kismin uzerinde bekleyip create method a tiklariz ve intelij otomatik olarak bir method olustururru sonra
    //kendi istegimize gore dizayn edebiliriz


    //Ornek 3 verilen iki tam sayiyi carpan ve sonucu yazdiran methodu olusturup kullaniniz



    //Ornek 4: verilen bir tamsayinin karesini hesaplayip konsola yazdiran methodu olusturup yazdirin

    /*
    homework
    1: Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2: Dairenin alanini gesaplayan methodu olusturunuz ve kullaniniz
     */



    }

