package javaSoruBankasi;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //1)Herhang! b!r 3 ögen!n f!yatları !ç!n double data t!p!nde deg!skenler olusturunuz. F!yatların toplamını konsola yazdırınız.
        double shoesPrice= 452.54;
        double shirtPrice= 89.54;
        double socksPrice= 13.78;
        System.out.println("Total price = " + (socksPrice+shirtPrice+shoesPrice));

        //2) Herhang! b!r 3 öge !ç!n float, long ve !nteger data t!p!nde deg!skenler olusturunuz. Budeg!skenler!n
        // degerler!n!n çarpımını konsolda yazdırınız.
        float a= 45646.46F;
        long  b= 787999L;
        int   c= 56866;
        System.out.println("(a*b*c) = " + (a*b*c));

        //3) Bas!t fa!z! bulmak !ç!n b!r kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        int anapara=500000;
        double oran=0.6;
        double yilDegeri= 1.3;
        double faiz= anapara*oran*yilDegeri/100;
        System.out.println("faiz = " + faiz);

        //4) B!r Str!ng ve !k! long data t!p!nde deg!sken olusturunuz. Konsolda bu long deg!skenler!n toplamını ve çarpımını Str!ng !le yazdırınız.
        String s="Sonuc:";
        long z=656565;
        long x=997966;
        System.out.println(s+(z+x));
        System.out.println(s+z*x);

        //5) Degerler! farklı olan !k! boolean data t!p!nde deg!sken olusturunuz ve bu degerler! !k!
        //ardısık deger arasında bosluk bırakacak sek!lde aynı satırda yazdırınız.
        boolean w= true;
        boolean e= false;
        System.out.println(w+" "+e);

        //6) 3 öge (k!tap, defter ve laptop) f!yatı !ç!n long data t!p!nde deg!skenler olusturunuz.
        //Konsolda 2 k!tap, 4 defter ve 3 laptop !ç!n toplam f!yatını yazdırınız.
        long kitap= 45L;
        long defter=7L;
        long laptop=3589L;
        System.out.println(2*kitap+4*defter+3*laptop);

        //7) Ik! tamsayıyı deg!st!rmek !ç!n b!r kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi giriniz :");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Degistirmeden once : " + n1 + " - " + n2);

        /*
        1.yol
        double t= n1;
        n1=n2;
        n2= t;
        System.out.println("Degistirmeden sonra : " + n1 + " - " + n2);
        */

        //2.yol
        n1=n1+n2;
        n2=n1-n2;
        n1=n2-n1;
        System.out.println("Degistirmeden sonra : " + n1 + " - " + n2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
