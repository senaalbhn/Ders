package day06swapvaluesstringmanipulations;

public class SwapValues {

    public static void main(String[] args) {

        //Swap : Yer dehistirmek 1. kap Patates 2. kap Domates ==> 1.kap Domates 2. kap Patates

        int a=12;
        int b= 5; // Swap'den sonra==> a=5 ve b=12;
        int temp=0;

        System.out.println("a = " +a);
        System.out.println("b = " + b);

        //1.adim
        temp=a;
        //2. adim
        a=b;
        //3.adim
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.yol:

       

        a= a+b;
        System.out.println("a = " + a);

        b=a-b;
        System.out.println("b = " + b);
        
        a= a-b;
        System.out.println("a = " + a);
    }
}
