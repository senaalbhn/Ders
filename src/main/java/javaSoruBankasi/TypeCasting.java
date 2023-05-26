package javaSoruBankasi;

public interface TypeCasting {
    public static void main(String[] args) {
        //1) Short data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.
        short a= 23;
        int intA= a;

        //2) Long data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.
        long b= 45L;
        int intB= (int)b;

        //3) Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r float deg!sken!ne dönüstürünüz.
        double c = 12;
        float floatC= (float)c;

        //4) Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r short deg!sken!ne dönüstürünüz.
        //Sonrasında bu short deg!sken!n deger!n! konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

        double d= 989.08;
        System.out.println("double d = " + d);
        short shortD = (short) d;
        System.out.println("short D = " + shortD);

        //5) Byte data t!p!nde b!r deg!sken olusturunuz ve onu b!r double deg!sken!ne dönüstürünüz.
        //Sonrasında bu double deg!sken!n deger!n! konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

       byte byteE= 5;
       double doubleE= byteE;
        System.out.println(doubleE);


    }
}
