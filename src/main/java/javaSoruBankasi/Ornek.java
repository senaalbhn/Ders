package javaSoruBankasi;

public class Ornek {
    public static void main(String[] args) {
        //B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
        //toplamını bulunuz.

        String a= " Ali Can ";
        a=a.trim();
        char ilkHarf=a.charAt(0);
        char sonHarf= a.charAt(a.length()-1);
        System.out.println(ilkHarf+sonHarf);



    }
}
