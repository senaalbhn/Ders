package day05concatinationoperatorstypecasting;

public class TypeCasting {
    public static void main(String[] args) {
        /*Numeric primitive  data type larinin birbirine donusturulemsine "Type Casting" denir
        Numeric (sayisal) Data type lar byte-short-int-long-float-double
         */
        //NOTE 1:Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
        //bu isleme "AutoWidening" (otomatik genisletme) denir
        //Note 2:Buyuk datatype larini kucuk data typelarina cevirmek riskli bir isdir ,java bu riskli isi otomatik olarak yapmaz
        //bu islemi kod yazandan bekler
        //Bu isleme "ExplicitNarrowing" (Acıktan Daraltma) denir
        //byte data type ini int data type ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening
        //int data type ni short data type ina ceviriniz
        int weight = 312;
        short weightShort = (short) weight;//Explicit Narrowing

        // int data type nin float data type ni ceviriniz

        int a= 5;
        System.out.println(a);
        float aFloat= a;
        System.out.println(aFloat);


        double car= 569.99;
        System.out.println(car);
        short carShort= (short) car;
        System.out.println(carShort);

        //Example
        short num= 260;
        System.out.println(num);//260
        byte numByte= (byte) num;
        System.out.println(numByte); //4
        //Note: donusum yaptiginiz sayi (260) donustureceginiz data type inin sinirlari disinda ise java kullandigimiz sayi ile mood islemi yapar.
        //Ve mod isleminin sonucu sizin yeni degeriniz olur

    }
}
