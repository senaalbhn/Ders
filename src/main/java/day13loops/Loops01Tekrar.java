package day13loops;

public class Loops01Tekrar {
    public static void main(String[] args) {
        //Ornek1: ekrana 5 kez "Uras cok tatli" yazdirin

        for (int i = 0; i < 6; i++) {
            System.out.println("Uras cok tatli");
        }
        //Ornek 2: 11 den 14e kadar tum sayilari ekrana yaziniz

        for (int i= 11;  i<15; i++){
            System.out.println(i);
        }

        //Ornek3: 40 dan 23 e kadar tum cift sayilari ekrana yazdirin

        for (int i=40;  i>23;  i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.

        for (int i= 18; i<56;  i++){
            if (i%2==1){
                System.out.println(i);
            }
        }















    }
}
