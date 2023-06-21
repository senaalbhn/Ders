package day30maps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        /*
        1. Mapler de sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2. Key kismi tekrarsiz, value kismi tekrarli olabilir
        3. Maplerdeki her bir elemana "Entry" denir, tamamina ise "EntrySet" denir
        4. Entry ler tekrarsiz oldugu icin EntrySet denir
        5. Key ve value lar ayri ayri data typlarinda olabilirler
        6. Map ler collection degildirler, farkli bir yapidir
        7. HashMapler entry leri rastgele siralar, bu yuzden en hizli map tir
         */
        //Map nasil olusturulur?
        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkey",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}
        //get() methodu "key" ile calisir ve value kismini verir
        int usaPopulation=countryPopulation.get("USA");
        System.out.println(usaPopulation);
        //Butun keyleri nasil alaniliriz
        Set<String> keys= countryPopulation.keySet();
        System.out.println(keys);
        //Butun value lari nasil alirim
        Collection<Integer> value=countryPopulation.values();
        System.out.println(value);


        //Ornek: CountryPopulation map indeki ulkelerin nufus ortalamasi nedir?
        Collection<Integer> values= countryPopulation.values();

        int sum=0;
        for (Integer w:values) {
            sum=sum+w;
        }
        System.out.println(sum/values.size());

        //Loop lar map ler de kullanilamaz, bunun icin entrySet methodunu kullaniriz
        //entrySet() map teki entry leri kalip halinde alip bize Set icine koyarak verir
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        //Ornek 2: countryPopulation Map indeki ulkelerin isimlerinin character sayisi ile nufuslarin toplamini bulunuz

        int toplam= 0;

        for (Map.Entry<String,Integer> w: entries) {
        toplam= toplam+ w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);



    }
}
