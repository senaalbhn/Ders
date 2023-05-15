package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation2 {
    public static void main(String[] args) {

        //Ornek: bir stringin belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olaral aliniz

        String a = "abc@gmail.com";

        int startIndex= a.indexOf('@')+1;
        int endingIndex=a.indexOf('.');
        String companyName =a.substring(startIndex,endingIndex);
        System.out.println("Company Name = " + companyName);

        //Ornek 2: Verilen iki stringin birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz

        String h= "ali Can";
        String i= "Ali Can";

        boolean result= h.equals(i);
        System.out.println(result);
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        Java da iki tane memory vardir
        1) Stack Memory==> Smaal
           a)kucuk memory dir
           b)Primitivleri ve non-primitivlerin referencelerini tutar
        2) Heap Memory==> Huge
           a) Buyuk memor dir
           b) Non-primitive datalari icerir
        ==> Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur ve
        bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodunu kullaniriz.
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir der ama biz code yazarkenmgenellikle Stringlerin adresleri ile degil degerleri ile ilgileniriz.
        Bu yuzden String karsilastirmalarinda "==" kullanmayiz.
        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir
         */

        String s= "Tom";
        String t= "Terry";
        String r= new String("Tom");

        System.out.println(s==t);// false cunku adresler ve degerler farkli
        System.out.println(s.equals(t));// false cunku degerler farkli
        System.out.println(s==r);//false cunku adresler farkli
        System.out.println(s.equals(r));//true cunku degerler ayni
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Ornek 3: Verilen iki Stringin birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eden kodu yaziniz
        // equalsIgnoreCase()iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eder
        String j= "ali Can";
        String k= "Ali Can";

        System.out.println(j.equalsIgnoreCase(k));

        /*HOMEWORK:
        1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

         */



    }
}
