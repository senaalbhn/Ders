package mentoring;

import java.util.Scanner;

public class IfSorulari {
    //Q01
    /* TASK :
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz */
    //Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
    //System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
    //kullanıcıya seçim içn işlem menusu yazdırdık
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Q02
        /*  TASK :
         *  Kullanicidan 3 tene pozitif  tam sayi alniz.
         *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
            eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
            INFO :
            üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
            a+b>c>a-b
            a+c>b>a-c
            b+c>a>b-c
            a=b=c ise es kenar ucgen*/

        //Q03
        /* TASK :
         *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
            INFO :
            BMI = kilo(kg) /(boy*boy)(m)
            BMI <=20 oldukca zayifsiniz
            20<BMI<=25 Normal sinirlardasiniz
            25<BMI<=30 Sisman kategorisindesiniz
            30<BMI ==> Obez grubundasiniz.*/

        System.out.println("Lutfen boyunuzu giriniz...");
        double b = input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz...");
        double k = input.nextDouble();

        if (k / (b * b) <= 20) {
            System.out.println("Oldukca zayifsiniz");
        } else if (k / (b * b) > 20 && k / (b * b) <= 25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (k / (b * b) > 25 && k / (b * b) <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else {
            System.out.println("Obez grubundasiniz");
        }


        //Q04
        /* TASK :
         * Kullanicidan IT alanini bilgisini alarak console'a
         * meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
          bilgilileri yazdiriniz*/

        System.out.println("Lutfen IT alanini bilginizi giriniz(QA, Dev, BA, PM)");
        String alan = input.next();

        if (alan.equalsIgnoreCase("qa")) {
            System.out.println("Meslek: Quality Analyst");
        } else if (alan.equalsIgnoreCase("dev")) {
            System.out.println("Meslek: Developer");
        } else if (alan.equalsIgnoreCase("ba")) {
            System.out.println("Meslek: Busines Analyst");
        } else if (alan.equalsIgnoreCase("pm")) {
            System.out.println("Meslek: Project Manager");
        } else {
            System.out.println("Lutfen gecerli bir alan giriniz!");
        }


        //Q05
        /* TASK :
           Kullanicidan  yasini ve kilosunu alaliniz
           18 yasindan kucuk ise kan bagisi yapamaz
           18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
           18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.*/

        System.out.println("Lutfen yasinizi giriniz...");
        byte age = input.nextByte();
        System.out.println("Lutfen kilonuzu giriniz");
        byte kilo = input.nextByte();

        if (age < 0 || kilo < 0) {
            System.out.println("Lutfen gecerli sayilar giriniz!");
        } else if (age < 18) {
            System.out.println("Kan bagisi yapamaz");
        } else {
            if (kilo < 50) {
                System.out.println("Kan bagisi yapamaz");
            } else {
                System.out.println("Kan bagisi yapabilir");
            }
        }


    }
}
