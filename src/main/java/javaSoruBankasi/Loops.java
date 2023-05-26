package javaSoruBankasi;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        // 1.Soru: 120'den 11'e kadar 4 !le bölüneb!len ve 6 !le bölüneb!len tüm tam sayıları aynı satırda !k!
        //        ardısık tam sayı arasında bosluk bırakarak yazınız.

        //for ile
        String a = "";
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                a = a + " " + i;
            }
        }
        System.out.print(a);
        System.out.println();

        //while ile
        String b = "";
        int j = 120;
        while (j > 10) {
            if (j % 4 == 0 && j % 6 == 0) {
                b = b + " " + j;
            } j--;
        }
        System.out.print(b);
        System.out.println();

        //do ile
        String c = "";
        int k = 120;
        do {
            if (k % 4 == 0 && k % 6 == 0) {
                c = c + " " + k;}
            k--;
        } while (k > 10);
        System.out.print(c);
        System.out.println();

        //2.Soru: B!r Str!ng’ de tekrarlanan karakterler! yazdırmak !ç!n kod yazınız.
        //Örneg!n; accessories ==> ces

        String word= "accessories";
        String bos= "";

        for (int i=0; i<word.length(); i++){

            String ch =word.substring(i,i+1);

            if (word.indexOf(ch)!=word.lastIndexOf(ch)){
                if (!bos.contains(ch)){
                    bos=bos+ch;
                }}}
        System.out.println(bos);


        String word2= "accessories";
        String bos2="";

        int i2= 0;
        while (i2<word2.length()){
           String ch2= word2.substring(i2,i2+1);
            if (word2.indexOf(ch2)!=word2.lastIndexOf(ch2)){
                if (!bos2.contains(ch2)){
                    bos2=bos2+ch2;
                }
            }
            i2++;
        } System.out.println(bos2);

        String word3= "accessories";
        String bos3= "";
        int i3= 0;
        do {
            String ch3= word3.substring(i3,i3+1);
            if (word3.indexOf(ch3)!=word3.lastIndexOf(ch3)){
                if (!bos3.contains(ch3)){
                    bos3=bos3+ch3;
                }
            }
            i3++;
        }while (i3<word3.length());
        System.out.println(bos3);

        //3)B!r Str!ng ‘ !n pal!ndrom olup olmadıgını kontrol etmek !ç!n kod yazınız. B!r Str!ng, ters! !le
        //aynıysa, buna pal!ndrom den!r. Örneg!n; “anna”, “123321” pal!ndromlardır.

        String city= "sart adamada tras";
        String ters= "";

        for (int i=city.length()-1; i>=0; i--){
            char kr= city.charAt(i);
            ters=ters+kr;
            }
        if (city.equals(ters)){
            System.out.println("Palindromdur");
            }else {
            System.out.println("Palindrom degildir");
        }

       // 4)Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
       //   Örnek; 223878 ´ 37

        int num= 223878;
        String numStr= String.valueOf(num);
        String empty="";
        for (int i=0; i<numStr.length(); i++){
          char ch= numStr.charAt(i);
          if (numStr.indexOf(ch)==numStr.lastIndexOf(ch)){
              empty= empty+ch;
          }
        }
        System.out.println("For "+empty);

        int num2= 223878;
        String numStr2= String.valueOf(num2);
        String epty2="";
        int z=0;
        while (z<numStr2.length()){
           char ch= numStr2.charAt(z);
           if (numStr2.indexOf(ch)==numStr2.lastIndexOf(ch)){
               epty2=epty2+ch;
           }
            z++;
        }
        System.out.println("While "+epty2);

        int nm= 223878;
        String yeni=String.valueOf(nm);
        String ekle="";

        int p= 0;
        do {
            char r= yeni.charAt(p);
            if (yeni.indexOf(r)==yeni.lastIndexOf(r)){
                ekle=ekle+r;
            }
            p++;
        }while (p<yeni.length());
        System.out.println("Do While "+ ekle);

        /*5) Asagıdak! görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
             A A A A A
             A A A A A
             A A A A A      */

        String e= "A";
        int sutun=5;
        int satir=3;

        for (int i=0; i<satir; i++){

            for (int f=0; f<sutun; f++){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println();
        int y=0;
        while (y<satir){
            for (int i = 0 ; i<sutun; i++){
                System.out.print(e+" ");
            }
            System.out.println();
            y++;
        }

        /*
        6) Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
            A
            A A
            A A A
            A A A A
         */
        System.out.println("for");
        int str=4;
        String yazi= "A";

        for (int u=1; u<=str; u++){

            for (int o=1; o<=u; o++){
                System.out.print(yazi+" ");
            }
            System.out.println();
        }
        System.out.println("While");
        int h=0;
        while (h<str){
            for (int i=0; i<=h; i++){
                System.out.print(yazi+" ");
            }
            System.out.println();
            h++;
        }
        System.out.println("Do While");
        int g=0;
        do {
            for (int i=0  ; i<=g; i++){
                System.out.print(yazi+" ");
            }
            System.out.println();
            g++;
        }while (g<str);

        //Asagıdak! çarpım tablosunu olusturmak !ç!n kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int carpim= 3;

        for (int i=1; i<11; i++){
            System.out.println(carpim + " x " + i + " = " + (carpim * i));
        }

        //8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardısık olacak sek!lde aralarında bosluk
        //bırakarak yazdırmak !ç!n gereken kodu yazınız.

        String åev= "";
        int å= 20;
        while (å>2){

            if (å%2==1){
                åev= åev +å+ " ";
            }
            å--;
        }
        System.out.println(åev);

        //9) Str!ng !ç!ndek! tüm küçük harfler! yıldız !saret!yle yazdırmak !ç!n gereken kodu yazınız.
        //Örneg!n; 'Al! Can?' ==> l*!*a*n*

        String alican= "Ali Can?";
        alican= alican.replaceAll("[^a-z]","");
        String nnm="";
        int n=0;
        do {
             nnm=nnm+alican.substring(n,n+1)+"*";
            n++;
        }while (n<alican.length());
        System.out.print(nnm);
        System.out.println();
        int m=0;
        while (m<alican.length()){
            String mm= alican.substring(m,m+1);
            System.out.print(mm+ " * ");
            m++;
        }
        System.out.println();



        //10) Ver!len ondalık sayının sadece ondalık kısmındak! rakamlarını, kend!s!nden önce b!r yıldız
        //!saret!yle yazdırmak !ç!n gereken kodu yazınız.
        //Örneg!n; 75.4238 ´ *4*2*3*8

        double ondalik=75.4238;
        String strOnd=String.valueOf(ondalik);
        int idxDt= strOnd.indexOf(".");
        String kisa= strOnd.substring(idxDt+1);

        String yazdir="";

        for (int i=0; i<kisa.length(); i++){
            yazdir=yazdir+"*"+kisa.charAt(i);

        }System.out.print(yazdir);





    }
}
