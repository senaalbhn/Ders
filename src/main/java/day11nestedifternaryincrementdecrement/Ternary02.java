package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {

        //Ornek1:
        int a= 10;
        int b= 20;
        int r1= b<a ? a++ : ++b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(r1);

        //Ornek2: Verilen bir sayinin degerini hesaplayan kodu yaziniz
        // -4 ==> -1*-4 4==>4 0==>0

        int c = -4;
        int r2= c<0 ? -1*c : c ;
        System.out.println(r2);

        //Ornek3: iki sayinin isaretleri ayni ise bu sayilari carpan, isaretleri farkli ise "farkli isaretleri carpamiyorum" mesaji verin

        int m= 5;
        int n= -6;

        Object r3=(m>0 && n>0) || (m<0 && n<0) ? m*n : "farkli isaretleri carpamiyorum";
        System.out.println(r3);

        //Ornek4: size verilen sayinin 3 basamkli olup olmadigini kontrol ediniz
        int p=-331;
        p= Math.abs(p);

        String r4= p>99 &&p<1000 ? p+ " uc basamaklidir" : p+ " uc basamakli degildir";
        System.out.println(r4);









    }
}
