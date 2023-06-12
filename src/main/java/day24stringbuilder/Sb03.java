package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        /*
        1) StringBuffer java'da String ureten bir classtir
           StrinBuffer java'nin string olusturmak icin olusturdugu ilk classtir
        2) StringBuffer , StrinBuilder'a cok benzer, yani ikiside "mutable" string uretir
        3) StringBuffer "multi-thread" dir, ama StringBuilder "multi-thread" degildir
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir
        5) "multi-thread" yapilirken islerin siralamasi onem arz eder,
           yapilan isleri mantikli bir siraya koymak "Synchronization" olarak adlandirilir
           StringBuffer "multi-thread" oldugundan ayni zamanda "Synchronization"dir.

        3 tane string olusturan class ogrebdik;
                1) Immutable string lazimsa: String Class
                2) Mutable string lazimsa: StringBuilder veya StringBuffer
                    a)StringBuffer'i multi-thread gerekirse kullaniriz
                    b)StrinBuilder multi-thread gerekmez ise kullanilir
         */

        StringBuffer sbf= new StringBuffer("Java");
        System.out.println(sbf);//Java


    }
}
