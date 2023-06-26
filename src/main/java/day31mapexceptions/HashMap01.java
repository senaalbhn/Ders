package day31mapexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //hashmap arkasinda calisan mekanizma nasil
        HashMap<String,String> capitals= new HashMap<>();
        capitals.put("USA","Wahhington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        capitals.put("Italy","Floransa");
        System.out.println(capitals.hashCode());
    }



}
