package day14loops;

public class Loops02 {
    public static void main(String[] args) {

        //Ornek 1: 5 den 8 e kadar tamsalarin toplamini veren kodu yazinniz

        int sum=0;

        for (int i=5; i<9; i++){
            sum=sum+i;
        }
        System.out.println("sonuc= "+sum);

        int a= 0;

        for (int i=0;    i<50;   i=i+5){
            a=a+i;

        }
        System.out.println(a);

        //Ornek 2: 7 den 9 a kadar tamsayilarin carpimi

        int b= 1;

        for (int i= 7;  i<10;  i++){
            b=b*i;
            System.out.println(b);
        }
        System.out.println("Sonuc: "+b);

        //Ornek 3: verilen bir sayinin rakamlaarinin toplamini veren kodu yaziniz
        // 578==> 5+7+8=20
        int n=0;
        int num=-578;
        num=Math.abs(num);

        for (int i=num; i>0; i=i/10){
            n=n+i%10;
            System.out.println(n);

        }










    }
}
