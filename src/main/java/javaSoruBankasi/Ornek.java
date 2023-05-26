package javaSoruBankasi;

public class Ornek {
    public static void main(String[] args) {
        //9) Ver!len b!r Str!ng arraydek! bel!rl! b!r ögen!n var olup olmadıgını bulmak !ç!n kod yazınız.

        String word[]= {"Apex", "is", "an", "object", "oriented", "programming", "language","object"};
        String a= "object";
        int couter=0;

        for (String w : word) {
            if (w.equalsIgnoreCase(a)) {
                couter++;
            }
        }
            if (couter>0){
                System.out.println("Kelime " + a + " array de bulunmaktadir");
            }else {
                System.out.println("Kelime "  + a + " array de bulunmamaktadir");
            }
        System.out.println(couter);





    }
}
