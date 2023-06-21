package day30maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1
        String s= "I like you, like like!";
        s= s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like
        String[] words=s.split(" ");
        System.out.println(Arrays.toString(words));
        HashMap<String,Integer> occ = new HashMap<>();

        for (String w:words) {
           Integer numOffOccurance= occ.get(w);
           if (numOffOccurance==null){
               occ.put(w,1);
           } else {
               occ.replace(w,numOffOccurance+1);
           }
        }
        System.out.println(occ);
    }
}
