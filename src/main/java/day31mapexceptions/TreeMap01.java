package day31mapexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1. HashTree thread-safe ve synchronized degildir,

    Note: Maplerde multi thread kullanmamiz gerekirse sadece Hashtable kullanabilirsiniz

    2. TreeMAp entry leri key lerine gore natural order yapar.Bu yuzden cooook yavastir
    3. TreeMaplerin keylerinde null kullanilamaz ama value larda istedigimiz kadar kullanabiliriz
     */
    public static void main(String[] args) {

        long t= System.nanoTime();

        TreeMap<String, Integer> countryPopu= new TreeMap<>();
        countryPopu.put("Usa",40000000);
        countryPopu.put("Netherland",1000000);
        countryPopu.put("Turkiye",8000000);
        countryPopu.put("Belgium",12000000);
        countryPopu.put("Mexico",12500000);
        countryPopu.put("Brasil",21500000);
        countryPopu.put("France",7500000);
        countryPopu.put("Finland",800000);
        countryPopu.put("Germany",8500000);
        System.out.println(countryPopu);

        long t1=System.nanoTime();

        HashMap<String,Integer> countryPop= new HashMap<>();
        countryPop.put("Usa",40000000);
        countryPop.put("Netherland",1000000);
        countryPop.put("Turkiye",8000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",12500000);
        countryPop.put("Brasil",21500000);
        countryPop.put("France",7500000);
        countryPop.put("Finland",800000);
        countryPop.put("Germany",8500000);
        System.out.println(countryPop);

        TreeMap<String, Integer> countrypopTree= new TreeMap<>(countryPop);

        long t2=System.nanoTime();

        System.out.println("treemap = " + (t1 - t));
        System.out.println("hashmap = " + (t2 - t1));
    }
}
