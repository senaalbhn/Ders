package day15loops;

public class WhileLoops01 {
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

        for (int i= 3; i<7; i++){

            System.out.print(i);
        }

        System.out.println();
        //2.yol: while loop
        int i=3;
        while (i<7){
            System.out.print(i);
            i++;
        }
        System.out.println();
        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz

        int k=23;
        while ( k>11 ){
            if (k%2==0){
                System.out.print(k);
            }
            k--;
        }
        System.out.println();
        //Ornek 3: 6 dan 19 a kadar tum tek sayilari console a yazdiriniz.

        int j=6;
        while (j<20){
            if (j%2==1){
                System.out.print(j+" ");
            }
            j++;
        }

























    }
}
