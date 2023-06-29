package day33exceptionenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*
    1. Iteratorler looplarin yaptigi ayni isi yapar
    2. Iterator'larda sonsuz loop olusma ihtimali yoktur
    3. Iterator'lar ile looplar arasinda performans farki yoktur
    4. Iterator'lar bir collection dan eleman silme ve bir cllection daki elemani degistirme konusunda daha basarilidir
    5. iki tim Iterator vardir
        a. Iterator: bu sadece eleman silmede kullanilir
           Eleman eklemek veya elemani degistirmek mumkun degildir
        b. ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir

        Note: Iterator sadece soldan saga (ilk elemandan son elemana) dogru calisir
              ListIterator ise iki yonlu calisabilir
     */

    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Sadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");
        System.out.println(myList);

        Iterator<String> myItr=myList.iterator();

        while (myItr.hasNext()){//hasNext() pointera senden sonra eleman var mi? diye sorar
                                //Eleman  varsa true yoksa false return eder
            String el=myItr.next();       //next(); pointeri bir sonraki elemanin onune tasir ve ustunden atladigi elemani yazdirir
            if (el.equals("Niyazi")){
                myItr.remove();}     //next(); methodunun return ettigi elemani siler
            System.out.println(myList);

        }
        System.out.println(myList);

        List<String> yourList= new ArrayList<>();
        yourList.add("Niyazi");
        yourList.add("Saadet");
        yourList.add("Fevzi");

        ListIterator<String> yourListItr= yourList.listIterator();

        while (yourListItr.hasNext()) {
            String el= yourListItr.next();

            yourListItr.set(el+"*");//set() methodu listi uptade islemi icin kullanilir
            System.out.println(yourList);
        }
        System.out.println(yourList);   //  [Niyazi*, Saadet*, Fevzi*]

        List<String> list3= new ArrayList<>();
        list3.add("Niyazi");
        list3.add("Saadet");
        list3.add("Fevzi");
        System.out.println(list3);

        ListIterator<String> listItr=list3.listIterator();

        //Loop kullanarak pointeri en sona almaliyiz

        while (listItr.hasNext()){
            listItr.next();
        }
        System.out.println(list3);
        while (listItr.hasPrevious()){
           String el= listItr.previous();
            System.out.println(el+"<==");
        }
        System.out.println(list3);












    }
}
