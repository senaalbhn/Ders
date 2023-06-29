package day18multidimensionalarray;

import java.util.Arrays;

public class MDTekrar {
    public static void main(String[] args) {

      int nums [][]= new int[2][3];
      nums [0][0]=0;
      nums [0][1]=1;
      nums [0][2]=2;
      nums [1][0]=3;
      nums [1][1]=4;
      nums [1][2]=5;
        System.out.println(Arrays.deepToString(nums));

        System.out.println(nums[1][1]);

      int nums2 [][]={{6,7,8},{9,10},{11},{12,13,14,15},{16}};
        System.out.println(Arrays.deepToString(nums2));

        int sum=0;

        for (int w []: nums2) {
            sum=sum+w.length;
        }
        System.out.println(sum);


        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Ornek 1: Yukaridaki students array inde icinde 'm' harfi olan isimleri console a yazdiriniz

        for (String w []: students) {
            for (String k: w) {
                if (k.contains("m")){
                    System.out.print(k+" ");
                }
            }
        }
        System.out.println();

        //Ornek 2: Bir integer multidimensional olusturunuz, tum elemanlarin carpimini hesaplayiniz

        int multy [][]= {{2,3},{6,7},{9}};
        int result=1;
        for (int [] w: multy) {
            for (int k:w ) {
                result=result*k;
            }
        }
        System.out.println(result);

        //Ornek: iki boyutlu bir Array i tek boyutlu bir Array e ceviriniz
        int numbers[][]={{5,4},{2,3,2}};// ==> {5,4,2,3,2}
        System.out.println(Arrays.deepToString(numbers));

        int numOfElement=0;
        for (int [] w: numbers){
                numOfElement=numOfElement+w.length;
            }

        System.out.println(numOfElement);

        //        String stdNames []= new String[5];

        int arr []= new int [numOfElement];

        int idx= 0;

        for(int [] w: numbers){
            for (int k:w) {
                arr [idx]=k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(arr));


        //Ornek: Bir integer multi dimensional arraydeki en kucuk ve en buyuk elemanlarin toplamini bulunuz

        int min= nums2[0][0];
        int max= nums2[0][0];

        for (int w[]: nums2) {
            for (int k:w) {
                min=Math.min(min,k);
                max=Math.max(max,k);
            }
        }
        int sum2= max+min;
        System.out.println(sum2);

    }
}
