package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //Ornek1: 21 den 180 e kadar hem 2 ye hem 3 e bolunen

        for (int i=21; i<181;i++){
            if (i%2==0 && i%3==0){
                System.out.println(i);
            }
        }

        //Ornek 2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        // ankara  ==> AKR
                String s = "ankara";
                for( int i=0   ; i<s.length()  ;    i++  ){
                   String ch = s.substring(i,i+1);
                    if(i%2==0){
                        System.out.println(ch.toUpperCase());
                    }
                }
        //Ornek 3: Verilen bir stringde ilk a harfinden onceki tum characterleri consola yazdirin
        // "I love Java" ==> "I loveJ"

        String s1="I love Java";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='a'){
                break;
            }
            System.out.println(s1.charAt(i));
        }

        //Ornek 4: Verilen bir string te son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //  "Germany"  ==>  yn

        String t ="Germany";

        for ( int i= t.length() -1 ;  i>=0  ;                 i-- ){

            if(t.charAt(i)=='a'){
                break;
            }

            System.out.print(t.charAt(i));
        }













    }
}
