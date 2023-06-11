package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz

        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);

        //Anlik zamnda birlesenleri nasil aliriz?

        int hour = myCurrentTime.getHour();
        int minute=myCurrentTime.getMinute();
        int second= myCurrentTime.getSecond();
        int nano= myCurrentTime.getNano();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);


        //Gelecek ve gecmise nasil gisilir
        System.out.println(myCurrentTime.plusHours(5));
        System.out.println(myCurrentTime.plusMinutes(80));

        System.out.println(myCurrentTime.minusHours(1));
        System.out.println(myCurrentTime.minusSeconds(1000));
        LocalTime a=myCurrentTime.minusNanos(316465466);

        //Zaman formati nasil degistirilir
        /*
        DateTime class ta kullanilan tarih saat formatlari
        * HH : mm ==> 24 lu saat sistemi
        * hh : mm ==> 12 li saat sistemi
        * hh : mm a ==> 12 li saat sistemi. AM ,PM gosterilir
        * HH : mm : ss ==> 24 lu saat sistemi
        * HH : MM ==> Yanlis Format! MM aylar icin kullanilir
        "mm" minute demektir, "MM" month demektir


        * dd-MM-yyyy ==> gun ay yil
        * MMM ==> ayi harf ile verir (Aug)
        * MMMM ==> ayi kelime olarak verir (August)

         */

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("HH: mm");
        String formatlisaat=dtf1.format(myCurrentTime);
        System.out.println(formatlisaat);

        LocalDate myDate=LocalDate.of(2023,8,23);
        System.out.println(myDate);
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formatliTarih=dtf2.format(myDate);
        System.out.println(formatliTarih);

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatliTarih2=dtf3.format(myDate);
        System.out.println(formatliTarih2);

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String formatliTarih3=dtf4.format(myDate);
        System.out.println(formatliTarih3);

        //Baska bir zaman dilimindeki tarih ve zamana nasil gidilir
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci
        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyoda saat kac
        LocalTime timeTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeTokyo);


        LocalTime timeAmsterdam=LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeAmsterdam);


        LocalTime timeOslo=LocalTime.now(ZoneId.of("Europe/Oslo"));
        System.out.println(timeOslo);




    }
}
