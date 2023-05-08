package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Obje nasil olusturulur
        // new keywordu sifirdan yeni bir obje olusutrmak icin kullanilir
        //Constructor Java da objeleri olusturmak icin kullanilan ozel bir methodtur.
        //Class name + object name + assigment operator+ "new" keywordu + Constructor
                Car     mycar           =                   new                Car();

        System.out.println("mycar.fiyat = " + mycar.fiyat);
        System.out.println("mycar.model = " + mycar.model);

        mycar.hareket();
        mycar.dur();

        Student alican = new Student();

        System.out.println("alican.name = " + alican.name);
        System.out.println("alican.grade = " + alican.grade);
        System.out.println("alican.adress = " + alican.adress);
        alican.study();
        alican.feed();

        /*
        Homework
        *icinde isim ve yas variablesi ile tech methodu bulunan bir teacher objekti olusturun ve yazdirin
         */


    }
}
