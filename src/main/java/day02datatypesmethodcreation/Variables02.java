package day02datatypesmethodcreation;

public class Variables02 {
    public static void main(String[] args) {

        /* Java da temelde iki tip data tip vardir.
        1)primitive
            char, boolean, byte, short, int, long. float, double
        2)non-primitive
            String...
         */

        /*
        Note1: Primitive data typlerini java olusturmustur, biz olusturamayiz.
        Note2: Primitive data typlerinin isimlerinde sadece kucuk harfler kullanilir.
        Note3: Primitive datalar data typlerina gore memory de farkli farkli yer kaplarlar.
        Note4: Primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar
         */

        /*
        Non-primitive Data Types
        Ornegin String non-primetive data typedir. Olusturulan her class bir non-primitive data typedir.
        *Uretilen her bir class ayni zamanda bir "non-primitive" data typedir. Bu yuzden "non-primitive"
        data typeler sinirsiz sayidadir denebilir.
        *Non-primitive data typlerin isimleri buyuk harf ile baslar.
        *Non-primative ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir
         */

        //Ornek1: Ulke ismi icin bir variable olusturun ve bir deger atayip konsola yazdirin

        String countryName= "Norway";
        System.out.println(countryName);
        // Norway==>NORWAY tum harfleri buyuk harfe ceviren method var
        // Norway==> 6 karakter sayisi veren method var

        /*
        Soru: primitive ve non-primitive data typler arasindaki farklar nelerdir?
        1) primitive ler sadece bizim atadigimiz degeri icerir
        non-primitiveler bizim atadigimiz degeri ve mothodlari icerir.
        2) primitiveler kucuk harfle baslar
        non-primitiveler buyuk harfle baslar
        3)primitiveleri java uretmistir ve 8 tanedir
        non-primitiveler java ve developerlar uretebilir ve sinirsiz sayidadir
        4) primitiveler memoryde data typlerine gore memory de sabit boyutta bellek kullanilirlar
        non-primativeler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanir.
         */

    }
}
