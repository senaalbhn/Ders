package day05concatinationoperatorstypecasting;

public class RepeatWrapper {


    public static void main(String[] args) {

        //Ornek 1: short data type inin minumum ve maksimum degerini kod yazarak bulunuz
        short min = Short.MIN_VALUE;
        short max = Short.MAX_VALUE;

        System.out.println("max = " + max + " " + "min = " + min);

        //Ornek 2: int data type nin minumum ve byte data typenin maximum degerini toplayin
        int intMin = Integer.MIN_VALUE;
        short shortShort = Short.MAX_VALUE;
        System.out.println("toplam = " + (shortShort + intMin));

        //Ornek 3: Primitive int i wrapper Integer e cevirin (Autoboxing)
        int a = 12;
        Integer integerA = a;

        //Ornek 4: wrapper Byte i primitive byte cevirin: (Unboxing)
        Byte u= 8;
        byte newU= u;

        //Ornek 5: primitive char i wrapper Charactere cevirin
        char uras= 'u';
        Character newUras= uras;

        //Ornek 6: wrapper Boolean i primitive boolean a ceviriniz

        Boolean isCute= true;
        boolean priIsCute= isCute;
        System.out.println(priIsCute);



    }
}
