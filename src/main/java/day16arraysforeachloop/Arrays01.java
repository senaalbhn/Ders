package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a= 13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        // Ama biz kod yazarken bir yapinin icinde coklui data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin java Array yapisini olusturmustur.

        //Array nasil olusturulur?
        String stdNames []= new String[5];
        System.out.println(stdNames);
        //Arrayler consola nasil yazdirilir
        //toString() methodu nu kullanmadan sadece array ismi ile yazdirirsan java o array in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

        //Arrayler diger collectionlardan cok cok daha hizlidir(superfast)
        //Arrayler diger collectionlardan daha az memory kullanirlar

        //Array a nasil eleman eklenir?
        stdNames [0]= "Robot supurge";
        stdNames[1]= "Uras";
        stdNames [2]="Susam";
        stdNames [3]="Sena";
        stdNames [4]= "Ramazan";

        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[1]);
        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);

        //1.Orek: Array de ki her elemanin sonuna "!" isareti koyarak ekrana yazdirin
        // length() string lerde method (parantezli), arrayler de parantezsiz yazilir(method degil)

        for (int i = 0; i <stdNames.length ; i++) {
            System.out.println(stdNames[i] + "!");
        }





    }
}
