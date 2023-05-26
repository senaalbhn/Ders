package mentoring;

import java.util.Scanner;

public class Homework01 {
    //Interview soruları
       //Q02
       /*Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar return eden metod yaziniz
         ornek:  input        output
            elma  2           eaea
            army  3           ayayay */

    //System.out.println("Lutfen bir meyve adi giriniz");
    //String fruit= input.nextLine();
    //System.out.println("Lutfen bir sayi giriniz");
    //int num= input.nextInt();

    //char f1= fruit.charAt(0);
    //char f2= fruit.charAt(fruit.length());
    //String f3= "f1"+"f2";
    //int a= fruit.length();

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //Q01
        /*Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
          ATM app. method create ediniz*/

        System.out.println("Hosgeldiniz. Lutfen yapacaginiz islemi secin\n Bakiye ogrenme icin => 1\n Para yatirma icin => 2\n" +
                " Para cekme icin =>3\n Cikis icin => 4");
        byte x= input.nextByte();
        int bakiye=1000;

        if (x==1) {
            System.out.println("Bakiyeniz : 1000TL");
        } else if (x==2) {
            System.out.println("Yatirmak istediginiz miktari giriniz");
            int yatirilanMiktar= input.nextInt();
            bakiye=yatirilanMiktar+bakiye;
            System.out.println("Yeni bakiyeniz: "+ bakiye);
        } else if (x==3) {
            System.out.println("Cekmek istediginiz miktari giriniz");
            int cekilenMiktar= input.nextInt();
            bakiye=bakiye-cekilenMiktar;
            System.out.println("Yeni bakiyeniz: "+ bakiye);
        } else if (x==4) {
            System.out.println("Iyi gunler...");
        } else {
            System.out.println("Gecerli bir islem seciniz");
        }


        //Q03
        //TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        System.out.println("Lutfen adresinizi giriniz...");
        String adres= input.nextLine();


        boolean adresKontrol = adres.replaceAll("\\S","").length()>0;
        System.out.println(adresKontrol);

        boolean adrskntrl= adres.contains(" ");
        System.out.println(adrskntrl);



        //Q04
        /* TASK :
        Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        */

        System.out.println(" Lutfen adinizi ve soyadinizi giriniz");
        String nameLastName= input.nextLine();

        int a= nameLastName.trim().indexOf(" ");
        String name= nameLastName.substring(0,a);
        String lastname= nameLastName.substring(a+1);
        System.out.println("Name : " + name);
        System.out.println("Lastname : " + lastname);

        //Q05
        /*TASK : Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
          Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        System.out.println("Lutfen isminiz, ikinci isminiz ve soyisminizi giriniz...");
        String firstName = input.nextLine();
        String secondName= input.nextLine();
        String lastName  = input.nextLine();

        char first= firstName.toUpperCase().charAt(0);
        char second= secondName.toUpperCase().charAt(0);
        char last= lastName.toUpperCase().charAt(0);
        System.out.println(first+ "."+ second+"."+last);

        //2.yol

        System.out.println("Lutfen isminizi giriniz");
        String nm= input.nextLine();

        nm=nm.trim().toUpperCase();
        char ilkHarf= nm.charAt(0);
        char ikinciHarf= nm.charAt(nm.indexOf(" ")+1);
        char ucuncuHarf= nm.charAt(nm.lastIndexOf(" ")+1);
        System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);

        System.out.println(nm.charAt(0)+"."+nm.charAt(nm.indexOf(" ")+1)+"."+nm.charAt(nm.lastIndexOf(" ")+1));



    }
}
