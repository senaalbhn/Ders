package day31mapexceptions;

public class e01 {
    /*
    Exception beklenedik problem demektir.
    Java cozemedigi bir problemle karsilastiginda exception class'i devreye girer.
    Exception class'i bize karsilasan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.

    Java exception firlattiginda kodun calismasini durdurur (Stops execution)
    Java exception olusturan kod icin bizden karar vermemizi ister

    exception firlatinca acilan kismin ismi "log".

    Eger hicbir sey yapmazsak beklendigi gibi java kodumuzun calismasini durdurur
    -Kodumuzun calismaya devam etmesini istiu\yorsak try catch ile exception olusturmasi muhtemel kodlarimizi try catch blogu icinde yazmaliyiz

    - exception handle edebilmek icin iki temel yol vardir
        1. Exception a uygun cozumler uretebilirsiniz. Buna exception Handling denir
        2. Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada throw exception denir

    -   Exceptiona uygun cozup uretme de try-catch kullanilir
        try block da yapilmasi gereken islemler Java dan istenir
        Java islemi problemsiz bir sekilde yaparsa catch block Java tarafindan okunmaz
        try block da islem yapilirken Exception olusursa catch block devreye girer
        ve catch block icindeki kodlar calisir
        try block da islem yapilirken Exception olusursa  try block icindeki exception dan sonraki kodlar calismaz

        catch parantez icine karsilasilmasi muhtemel olan exception class isimini ve bir obje ismi (e) catch bloguna ise
        exception ile karsilasildiginda yapilmasi istenen kodlari yazariz.

        if else kullanirsak olusabilecek her problemi specific olarak if parantezine yazmamiz gerekir, buda neredeyse imkansizdir
        ve yazacagımız kodu cok uzatir ama try catch te java ilgili exception ile alakali olusabalieceek tum problemleri yakalar

     */
    public static void main(String[] args) {

        int a=12;
        int b= 0;
        divide(a,b);
        divide2(a,b);


    }
    //ArithmeticException yazdiginiz code da matamatiksel islem kullaniyorsaniz alinabilecek bir exceptiondur
    public static void divide2(int a, int b){
        try {
            System.out.println("try block exception oncesi");
            System.out.println(a/b);
            System.out.println("try block exception sonrasi");
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }
    }

    //Kesinlikle tavsiye edilmez
    public static void divide(int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        }else{
        System.out.println(a/b);
        }
    }



}
