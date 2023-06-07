package javaSoruBankasi;

public class StringManipulation {
    public static void main(String[] args) {
        //1) Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
        //!sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
        //yazdırınız.
        //Örnek: mIAMI - Miami
        //miami - Miami
        //MIAMI - Miami
        //mIaMi - Miami vb.
        
        String cityName= "baLiKesiR";
        String newCityName= cityName.trim().toUpperCase().charAt(0)+cityName.toLowerCase().substring(1);
        System.out.println("newCityName = " + newCityName);

        String sehirIsim = " mIAMI ";
        String konsolSehirIsım = sehirIsim.trim().toLowerCase();
        konsolSehirIsım = konsolSehirIsım.substring(0,1).toUpperCase() + konsolSehirIsım.substring(1);
        System.out.println(konsolSehirIsım);

        //2) Kisi isimleri icin 3 String degisken olusturunuz. Bosluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
        // Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

        String r= "Ramazan Can";
        String u= "Uras Can";
        String s= "Sena Gul";

        int sayiR=r.replace(" ","").length();
        int sayiU=u.replace(" ","").length();
        int sayiS=s.replace(" ","").length();
        System.out.println("toplam = " + (sayiR + sayiS + sayiU));

        //3)B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! toplam alfabet!k ve sayısal karakter sayısını konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String a= "' Miami 33018!!! ";

        Integer krktrSysi= a.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println("karakter sayisi = " + krktrSysi);

        //4)B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını konsolda yazdırınız.
        // Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

        String z= "1a3Bcf4!...";
        Integer z2=z.replaceAll("[0-9]","").length();
        System.out.println("Z'nin Karakter sayisi = " + z2);

        // 5)B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son karakter! yazdırınız.
        //Örnek: 'Ali Can' için n yazdırmalısınız.
        //‘Miami’ için i yazdırmalısınız.

        String c= " Ali Can ";
        c=c.trim();
        char sonKarakter = c.charAt(c.length()-1);
        System.out.println("Son Karakter = " + sonKarakter);

        //6)B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n toplamını bulunuz.

        String q= " Uras ";
        q=q.trim();
        int toplam= q.charAt(0)+q.charAt(q.length()-1);
        System.out.println("toplam = " + toplam);

        //7) B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsold yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

        String k= "Susam";
        String k2= k.substring(1);
        System.out.println(k2);

        //8)


    }
}
