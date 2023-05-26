package day14loops;

public class Loops01 {
    public static void main(String[] args) {

        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        String t="Java";
        String ters= "";
        for (int i= t.length()-1; i>=0; i--){
            ters= ters+t.substring(i,i+1);
        }
        System.out.print(ters);

        System.out.println("");

        String u= "java";
        String ters2="";
        for (int i=u.length()-1; i>=0; i--){
            ters2=ters2+u.charAt(i);
        }
        System.out.println(ters2);

        //Ornek 2= Size veilen bir stringin polindrome olup olmadigini kontrol eden kodu yaziniz

        String duz="ey edip adanada pide ye";
        String ters3="";

        for (int i=duz.length()-1; i>=0; i--){
             ters3=ters3+duz.charAt(i);
        }
        System.out.println(ters3);

        if (ters3.equalsIgnoreCase(duz)){
            System.out.println("Polindrome dur");
        }else {
            System.out.println("Polindrome degildir");
        }







    }

}
