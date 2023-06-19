package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    1) Setler tekrarsiz eleman (unique) depolamak icin kullanilir
    2) 3 tane Set class vardir
            a. HashSet Class:
               "Hash" benzesiz bir id olusturma teknigidir. Bu teknige "Hash Technique" denir.
               "HashSet elemanlari rastgele siralar.
               "HashSet" elemanlari siralamadigindan cok hizli calisir
               "HAshSetler" null i eleman olarak kabul eder

            b. LinkedHashSet Class:
                "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore (insertion order) dizdiklerinden
                "HashSet"lere gore yavastirlar.
                "LinkedHashSet"ler tekrarsiz eleman depolamak icindir

            c. TreeSet Class
                "TreeSet Class"ler elemanlari natural order (kucukten buyuge yada alfabetik sira) a gore dizer.
                En yavas Set "TreeSet"tir
      3) TreeSet coook yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
     */

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Uras");
        hs.add("Sena");
        hs.add("Ramazan");
        hs.add("Susam");
        hs.add("Robot Supurge");
        hs.add("Karpuz");
        hs.add("Cop kutusu");
        hs.add("Suluk");
        hs.add(null);
        System.out.println(hs);

        hs.add("Uras");//Tekrarli eleman eklendiginde hata vermez ama tekrarli elemani sadeve bir kez veirir
        System.out.println(hs);

        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lgs= new LinkedHashSet<>();
        lgs.add(7);
        lgs.add(19);
        lgs.add(13);
        lgs.add(-35);
        lgs.add(null);
        lgs.add(null);
        System.out.println(lgs);

        LinkedHashSet<Integer> ls= new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(13);
        ls.add(353);
        ls.add(313);


        lgs.retainAll(ls);
        System.out.println(ls);
        System.out.println(lgs);

        TreeSet<Character> ts= new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Z');
        ts.add('T');
        // ts.add(null);==> TreeSetlerde null eklenemez
        System.out.println(ts);//[A, B, E, G, L, Y]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('E'));// B=> Verilen eleman olan E den bir onceki elemani verir
        System.out.println(ts.lower('F'));// E
        System.out.println(ts.lower('A'));//null

        System.out.println(ts.higher('L'));
        System.out.println(ts.higher('N'));

        System.out.println(ts.headSet('G'));
        System.out.println(ts.headSet('G',true));

        System.out.println(ts.tailSet('G'));
        System.out.println(ts.tailSet('G',false));

        System.out.println(ts.subSet('E', 'N'));
        System.out.println(ts.subSet('E',false, 'N',true));

        System.out.println(ts.ceiling('T'));
        System.out.println(ts.ceiling('O'));

        System.out.println(ts.floor('B'));//B
        System.out.println(ts.floor('C'));//B


    }







}
