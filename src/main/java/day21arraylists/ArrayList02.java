package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Bir list'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki listin esit olabilmesi icin ayni indexte ayni elemanlar olmalidir

        ArrayList<String> names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean r= names1.equals(names2);
        System.out.println(r);

        //Ornek2: Size verilen bir Integer List'te tamamiyla ayni elemanlarin olup olmadigini kontrol ediniz
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean r1=nums1.equals(nums2);
        System.out.println(r1);

        //ArrayList'te bir elemanin ilk gorunumu nasil gilinir?
        ArrayList<String>cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);

        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));
        System.out.println(cities);

        //ArrayList'te bir eleman index i kullanarak nasil silebilirim
        System.out.println(cities.remove(2));
        System.out.println(cities);
        //remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder
        //remove() methodu eleman ile kullanilirsa size o elamani silip silmedigini ifade eden boolean return eder

        //ArrayList olustururken sag tarafa (Constructor) ArrayList yazmak zorundayiz.
        //Ama sol tarafa ister ArrayList ister List yazin ikiside calisir
        //Detaylari Collection konusunda gorecegiz

        //Ornek:Bir Integer list olusturun ve "12" elemani listen siliniz

        List<Integer> ages= new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

      //  ages.remove(12);
      //  System.out.println(ages);

        //1.way
       // Integer nonPrimitive=12;
        //ages.remove(nonPrimitive);

        //2.way
        //ages.remove((Integer) 12);

        //3.way
       // ages.remove(Integer.valueOf(12));

        //4.way
        ages.remove(ages.indexOf(12));
        System.out.println(ages);

        //Bir ArrayList'teki bir elemanin tum gorunumøerini nasil sileriz
        List<String>citiesToRemove= new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");
        cities.removeAll(citiesToRemove);
        System.out.println(cities);


    }
}
