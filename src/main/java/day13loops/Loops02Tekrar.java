package day13loops;

public class Loops02Tekrar {
    public static void main(String[] args) {

        //Ornek1: 21 den 180 e kadar hem 2 ye hem 3 e bolunen

        for (int i=21;  i<181; i++){
            if (i%2==0 && i%3==0){

                System.out.println(i);
            }
        }

        //Ornek 2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        // ankara  ==> AKR

        String a= "Ankara";

        for (int i = 0; i < a.length(); i++) {

            String ch= a.substring(i,i+1);

            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }

        }
        System.out.println(" ");

        //Ornek 3: Verilen bir stringde ilk a harfinden onceki tum characterleri consola yazdirin
        // "I love Java" ==> "I loveJ"

       String s="I love Java";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }


        System.out.println(" ");
        //Ornek 4: Verilen bir string te son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //  "Germany"  ==>  yn

        String u= "Germany";

        for (int i = u.length()-1; i >0 ; i--) {
            if (u.charAt(i)=='a'){
                break;
            }
            System.out.print(u.charAt(i));
        }






















    }
}
