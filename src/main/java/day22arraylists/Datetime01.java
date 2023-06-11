package day22arraylists;

import java.time.*;
import java.util.Scanner;

public class Datetime01 {
    public static void main(String[] args) {


        //icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDay= LocalDate.now();
        System.out.println(myCurrentDay);

        //Tarihten istedigimiz bir birleseni nasil aliriz?
        int monthValue=myCurrentDay.getDayOfMonth();
        System.out.println(monthValue);

        int yearValue=myCurrentDay.getYear();
        System.out.println(yearValue);

        int dayValue=myCurrentDay.getDayOfMonth();
        System.out.println(dayValue);

        int yilinGunu= myCurrentDay.getDayOfYear();
        System.out.println(yilinGunu);

        //Month bir Enum dir
        //Enum java da sabit degeri (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir

        Month mounthName=myCurrentDay.getMonth();
        System.out.println(mounthName);

        DayOfWeek hafta= myCurrentDay.getDayOfWeek();
        System.out.println(hafta);

        //Ileriki tarihe nasil gidilir
        System.out.println(myCurrentDay.plusDays(5).plusMonths(5).plusYears(4).plusWeeks(8));

        //Gerideki tarihe nasil gidilir
        System.out.println(myCurrentDay.minusYears(1).minusDays(1).minusMonths(1).minusWeeks(1));

        //Specific bit tarih objesi nasil olusturulur
        LocalDate tarih=LocalDate.of(1993,8,31);
        LocalDate tarih2=LocalDate.of(1993,10,06);


        //bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean r= tarih.isAfter(tarih2);
        System.out.println(r);

        //Bir tarihin baska bir tarihten once olup olmadigini nasil konrol ederiz
        boolean r2= tarih.isBefore(tarih2);
        System.out.println(r2);

        //Bir tarihin bir baska tarihle esit olup olmadigini montrol ediniz
        boolean r3= tarih.isEqual(tarih2);
        System.out.println(r3);

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate +" invalid date.");
        }else {
            System.out.println("Enter time for the ticket");
        }






    }
}
