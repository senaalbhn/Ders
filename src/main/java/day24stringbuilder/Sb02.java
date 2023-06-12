package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy
        sb1.reverse();
        System.out.println(sb1);

        sb1.deleteCharAt(0);
        System.out.println(sb1);

        sb1.delete(1,4);
        System.out.println(sb1);

        sb1.replace(0,3,"Java");
        System.out.println(sb1);

        sb1.replace(4,5," = ");
        System.out.println(sb1);

        sb1.insert(4,"XXX");
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder("Hava");
        StringBuilder sb3= new StringBuilder("Hava");

        int r1=sb2.compareTo(sb3);
        System.out.println(r1);
        //Sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //Sonuc -1 ise sb2 sb3 ten alfabetik olarak bir onde demektir
        //Sonuc 1 ise sb2 sb3 ten alfabetik olarak bir geride demektir

        //StringBuilder nasil stringe cevrilir
        String str=sb2.toString().toUpperCase();
        System.out.println(sb2);

        //String nasil StringBuilder a cevrilir
        StringBuilder newSb2= new  StringBuilder(str);
        System.out.println(newSb2);


    }
}
