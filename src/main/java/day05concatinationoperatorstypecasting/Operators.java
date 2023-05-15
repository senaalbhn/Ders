package day05concatinationoperatorstypecasting;

public class Operators {

    /*
    1) +,-,/,* islemleri matematikte kullanildigi gibi kullanilir
    Note1: int/int=> int olur
    Note2: double+int=>double olur
    cunku; java da matematiksel islemlerde farkli data type lari kullanilirsa sonuc herzaman buyuk data type nda olur
    2) java da "Logical Operator" lar vardir. AND(&&) ve OR (||)  islemleri Logicial operatorlerdir
    i) AND (&&) isleminde true alabilmek icin her sey true olmalidir.
           AND islemi "perfectionist" tir
           AND isleminde bir tane  false sonucu false yapar

        ii)OR isleminde (||) bir tane true sonucu true yapmaya yeter
           OR isleminde sonucun false olmasi icin hersey false olmalidir
           OR islemi "polyanna" gibidir.

        iii) NOT Operotor (!) true olani false, false olani true yapar
            !true ==> false
            !false==> true
            !!true ==>true

   3)Comparison (Karsilastirma) Operators
            <,>,<=,>=,==,!=
    NOTE: Karsilastirma operatorlarini kullandiginizda kesinlikle boolean (true veya false) alirsiniz

      NOTE : Biz AND islemi icin && kullaniriz ama & kullanimda gecerlidir
            Farklari nedir?
            && kullanim ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir
            cunku and isleminde ilk  ifade false ise digerlerinin ne oldugunun bir önemi yoktur sonuc false olur
            & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayisiyla yavas calisir
            bu yuzden biz hep && kullaniriz.
       */
    public static void main(String[] args) {

        boolean first= 3<5;
        System.out.println(first);

        boolean second= 2+3 !=5;
        System.out.println(second);

        boolean third = 2+3*5>19;
        System.out.println(third);

        System.out.println(first + "-"+ second+"-"+third);

        System.out.println(first&&second);
        System.out.println(first||second||third);

    }



}
