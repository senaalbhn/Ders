package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //Ornek 1: ekrana 5 kere "Hi" yazdiriniz

        /*
        Code Standarts
        1) Repetition (tekrar) olmamalidir
        2)Dynamic olmalidir
        3)Fix (tamir) ve update kolay olmalidir
         */
        /*Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir.
        Dort tane loop vardir.
        1) for-loop
        2) while- loop
        3) do-while-loop 
        4) for-each loop
         */

        //a) for - loop
        /*
        for(Baslangic Degeri      ; Loop un calisma sarti   ;  Artirma/Eksiltme     ){
            //calisacak kodlar
        }
        *///i=i+i /  i+=1 / i++
        //Baslangic Degeri      ; Loop un calisma sarti   ;  Artirma/Eksiltme

        for(   int i =    1     ;     i<6                 ;      i++           ){
            System.out.println("Hi");
        }

        //Ornek 2: 11 den 14e kadar tum sayilari ekrana yaziniz

        for (int i= 11;  i<15; i++){
            System.out.println(i);
        }

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.

       for ( int i = 18; i<57; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }

        //Ornek3: 40 dan 23 e kadar tum cift sayilari ekrana yazdirin

        for (int i= 40; i>22; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }











    }
}
