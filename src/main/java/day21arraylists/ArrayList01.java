package day21arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
          /*
        1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacağınız eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisni 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;
            a)Array ler super hizlidir.
            b)Array ler memory de cok az yer kaplar.
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve "reference" lari depolayabilir.
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplarlar
         */

        //ArrayList nasil olusturulur?
        ArrayList<Integer>ages=new ArrayList<>();

        //ArrayList nasil yazdirilir?
        System.out.println(ages);

        //ArrayList e eleman nasil eklenir?
        //ArrayList lere eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada list e ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(2,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);

        //List e coklu eleman nasil ekleni? veya List e baska bir List nasil eklenir?
        //bir List'e coklu eleman eklemek icin o elemanlari once bir list'in icine koymaliyiz

        ArrayList<Integer> newAges= new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);
        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(2,newAges);
        System.out.println(ages);


        //ArrayList' te eleman sayisi nasil bulunur?
        //size() methodu bir list'teki eleman sayisini verir

        int numOfElement=ages.size();
        System.out.println(numOfElement);

        //ArrayList'e specific bir eleman nasil alinir
        int eleman1= ages.get(1);
        System.out.println(eleman1);

        //ArrayList'te specific bir eleman nasil degistirilir
        ages.set(6,111);
        ages.set(4,313);
        System.out.println(ages);

        //Bir list'teki tum elemanlari nasil silinir?
        ages.clear();
        System.out.println(ages);

        //ArrayList'te specific bir eleman olup olmadigini nasil buluruz?
        boolean r=ages.contains(656);

        //Bir ArrayList'in bos olup olmadigini nasil anlariz
        //isEmpty() methodu ArrayList bos ise true dolu ise false verir
        boolean r2=ages.isEmpty();

        //Ornek: size verilen bir list'in bos olup olmadigini kontrol ediniz

        ArrayList<String> names=new ArrayList<>();
        names.add("Uras");
        names.add("Susam");
        names.add("Sena");

        //1.way
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has "+names.size()+" element/s");
        }

        names.clear();

        //2.way
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has "+names.size()+" element/s");
        }


        /*
            Bir method ogrenirken uc seyi ogrenin:
            1. Bu method ne is yapar.
            2. Bu method nasil kullanilir.
            3. Bu method size neyi verir.
         */




    }
}
