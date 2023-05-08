package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Javada method nasil oluturulur

    1) main methodun disinda classin icinde olusturulur
    2)Access Modifier+ return type+ mothood ismi+ parantez ()+ {}

    Olusturulan methodlar nasil calistirilir
    1) methodu oluturmak methodu calistirmak icin yeterli degildir
    kullanilmak istenen method main methodun icinden kullanilir.
    2) methodun ismi+ () yazin
    varsa islem yapacaginiz datalari parantez icine koyun
    bu islem method call olarak adlandirilir
    3) methodun ismi+parametreler ==>method signature

     */

    public static void main(String[] args) {
      int sonuc=  toplamaYap(3, 5);
        System.out.println(sonuc);

        long carpmasonucu= multiply(4,5);
        System.out.println(carpmasonucu);

       firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

    }

    // Ornek1:toplama islei yapan  bir method olusturun ve kullaniniz
    public static int toplamaYap (int a, int b ){//bu kisimda method kapsaminda kullanilmasini ve islenmesini istedigimiz datalari declare ederiz
       return a+b;
       // return demek bu methodun cagrildigi yere bu degeri return et demek
        // main method statik oldugu icin main method icinde kullanacagimiz method statik olmalidir
    }
        //ornek2: " sayiyi carma islemi yapan bir mathod olusturun ve kullanin

    protected static long multiply(int a, int b){
        return a*b;

    }

    //Ornek3: veriler 3 sayidan ilk ikisini carpin ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;

    }

    /*
    1) diktortgenin alanini hesaplayan methodu olusturun ve kullanin
    2) diktortgenin cevresini hesaplayan methodu olusturun ve kullanin
     */
    }

