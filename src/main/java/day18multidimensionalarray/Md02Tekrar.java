package day18multidimensionalarray;

public class Md02Tekrar {
    public static void main(String[] args) {
        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Ornek 1: Yukaridaki students array inde icinde 'm' harfi olan isimleri console a yazdiriniz

        for (String [] w: students){

            for (String k: w){
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }

        }




        //Ornek 2: Bir integer multidimensional olusturunuz, tum elemanlarin carpimini hesaplayiniz

        int a[][]= {{5,4},{2,3,2},{7}};
        int b=1;

        for (int[] w: a){
            for (int k: w){
                b= b*k;
            }
        }
        System.out.println(b);


    }
}
