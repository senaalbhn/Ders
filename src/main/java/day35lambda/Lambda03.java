package day35lambda;

import java.util.List;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {


        System.out.println(getSumFromSevenToSeventy());
        int multiply= getMultiplyFromSThreeToNine();
        System.out.println(multiply);
        System.out.println(getFoctorial(4));
        System.out.println(getSumOfEvenBetweenTwoInt(4,1));
        System.out.println(getSumOfEvenBetweenTwoInt2(2,22));

    }

    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz

    public static int getSumFromSevenToSeventy(){
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();

    }

    //10)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.yol

    public static int getMultiplyFromSThreeToNine(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();

    }

    public static int getMultiplyFromSThreeToNine2(){
        return IntStream.
                range(3,10).
                reduce(Math::multiplyExact).
                getAsInt();

    }

    // 11) Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFoctorial(int x){

        if (x==0){
            return 1;
        }else if (x<0){
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin
    // toplamini veren methodu olusturunuz.

    public static int getSumOfEvenBetweenTwoInt(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b= temp;
        }

      return  IntStream.
              range(a+1,b).
              filter(t-> t%2==0).
              sum();
    }

    //2.yol
    public static int getSumOfEvenBetweenTwoInt2(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b= temp;
        }

        return  IntStream.
                range(a+1,b).
                filter(Utils::isNumberEven).
                sum();
    }

















}
