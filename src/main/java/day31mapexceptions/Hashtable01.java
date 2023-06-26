package day31mapexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    /*
    HashMap ile Hashtable arasindaki fark nedir?
    1. HashMap thread-safe ve synchronized degildir,
       Hashtable thread-safe(multithread/ayni anda birden cok is yapabilmek) ve synchronizeddir(multitreadlerde mantikli sirayla is yapmak).
    2. HAsMAp bir tane null key e ve istediginiz kadar null value a musade eder
       Hastable null key e ve null value a musade etmez
    3. HasMap hizlidir, Hashtable HashMaplere gore yavastir

    Note: HashMAp ve Hashtable ikiside entry leri rasgele siralar
     */
    public static void main(String[] args) {

        Hashtable<String,Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa",41);
        stdAges.put(null,12);
        stdAges.put("Uras",1);
        stdAges.put("Susam",3);
        stdAges.put("Bebo", null);


























    }
}
