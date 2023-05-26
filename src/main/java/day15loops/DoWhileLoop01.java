package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

         /*while loop kalibi
        baslangic degeri

         while(loop calisma kurali ){

            calisacak kodlar

            artirma/azaltma
         }*/
        /*
        baslangic degeri
                do{
                    calisacak kodlar
                    artirma/azaltma
                }while(loop calisma kurali);
        */

        //Ornek 1: 5  den 3 e kadar tamsayilari console a yazdiriniz

        int i=5;
        do {
            System.out.println(i);
            i--;
        }while (i>2);

        int j= 8;
        do {
            System.out.println(j+":)");
            j++;
        }while (j<18);

        //  1) while-loop
        int l =1;
        while (l<1){
            System.out.println("Sen bir while loopsun..");
            l++;
        }
        //while loop ta zero execution mumkundur


        //2) do-while-loop
        int k =1;
        do{
            System.out.println("Sen bir do-while loopsun..");
            k++;
        }while (k<1);
        //do while kullandiginizda loop body en az bir kere calisir, zero execution mumkun degildir.






















    }
}
