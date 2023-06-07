package javaSoruBankasi;

public class WrapperClasses {
    public static void main(String[] args) {
        // 1)Byte data t!p!n!n m!n!mum deger! !le short data t!p!n!n maks!mum deger!n!n toplamını
        //bulmak !ç!n b!r kod yazınız.
        byte a= Byte.MIN_VALUE;
        short b=Short.MAX_VALUE;
        System.out.println("Toplam = " +(a+ b));

        // 2)Data t!p! Str!ng olan “103” deger!n! byte data t!p!ne dönüstürmek !ç!n b!r kod yazınız ve
        //y!ne data t!p! Str!ng olan “2351” deger!n! short data t!p!ne dönüstürüp konsolda !k!
        //deg!sken arasındak! farkı yazdırınız.

        String e= "103";
        String d= "2351";

        byte byteE= Byte.valueOf(e);
        short shortD= Short.valueOf(d);
        System.out.println("fark : "+(byteE-shortD));



    }
}
