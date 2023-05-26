package day15loops;

public class WhileLoops01Tekrar {
    public static void main(String[] args) {

        //kalibini olusturalim
       /*
        for (baslangic degeri ; loop calisma kurali ; artirma/azaltma) {
            calisacak kodlar
        }

        */
        /*while loop kalibi
        baslangic degeri
         while(loop calisma kurali ){
            calisacak kodlar
            artirma/azaltma
         }*/

        //Ornek 1: 3 ten 6 ya kadar tam sayilari console a yazdiriniz

        //1. yol : for loop

        for (int i = 3; i <7 ; i++) {
            System.out.print(i);
        }
        System.out.println();
        int k= 3;
        while (k<7){
            System.out.print(k);
            k++;
        }
        System.out.println();
        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz

        int a=23;
        while (a>=12){
            if (a%2==0){
            System.out.print(a+" ");}
            a--;
        }
        System.out.println();

        //Ornek 3: 6 dan 19 a kadar tum tek sayilari console a yazdiriniz.
        int b= 6;
        while (b<20){
            if (b%2==1){
                System.out.print(b+" ");
            }
            b++;
        }































    }
}
