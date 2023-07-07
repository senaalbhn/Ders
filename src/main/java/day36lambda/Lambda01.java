package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        Course courseTurkishDay= new Course("Summer", "Turkish Day", 97,128);
        Course courseTurkishNight= new Course("Winter", "Turkish Night", 98,155);
        Course courseEnglishDay= new Course("Spring", "English Day", 95,132);
        Course courseEnglishNight= new Course("Winter", "English Night", 93,144);


        List<Course> courseList= new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //1. Tum "avarageScore" larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz
        boolean r1=courseList.stream().allMatch(t-> t.getAvarageScore()>91);
        System.out.println(r1);

        //AllMatch: verilen sarta gore stream icindeki tum elemanlarin bu sarta uymasi durumunda true verecektir
        //bir tane bile sart saglamaz ise sonuc false olur

        //2. Kurs isimlerinden en az birinin "Turkish" kelimesi icerip icermedigini kontrol eden kodu yaziniz

        boolean r2=courseList.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
        System.out.println(r2);

        //AnyMatch: verilen sarta gore stream icindeki herhangi bir elemanlarin bu sarta uymasi durumunda true verecektir


        //3. Kurs donemlerinin icinde "Fall" kelimesini icermedigini kontrol eden kodu yaziniz
        boolean r3=courseList.stream().noneMatch(t-> t.getSeason().contains("Fall"));
        System.out.println(r3);

        //NoneMatch: verilen sarta gore stream icindeki hic bir elemanin bu sarti saglamamasi durumunda true verecektir

        //4. Avarage score u en yuksek olan kursun ismini console a yazdiran kodu yaziniz
        String printCourseName=courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(printCourseName);

        //5. Tum course objelerini kucukten buyuge dogru diziniz ve ilk ikisi haric liste halinde yazdiriniz
        List<Course> myList= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);

        //6. Tum course objelerinin avarage score larina gore kucukten buyuge diziniz ve ilk ucunu liste halinde console yazdiriniz
        List<Course> myList2= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);

        //Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde veren kodu yaziniz
        List<Course> myList3= courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudent).reversed()).collect(Collectors.toList());


        //8. Kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz

        long engligsCourse= courseList.stream().filter(t-> t.getCourseName().contains("English")).count();
        System.out.println(engligsCourse);

        //9. Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

        List<Course> myList4= courseList.stream().filter(t-> t.getNumberOfStudent()<140).collect(Collectors.toList());
        System.out.println(myList4);


    }
}
