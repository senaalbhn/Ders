package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04Tekrar {
    public static void main(String[] args) {

                /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ulke ismini giriniz");
        String countryName= scan.nextLine();

        switch (countryName.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "spain":
                System.out.println("SP");
                break;
            case "france":
                System.out.println("FR");
                break;
            case "bulgaria":
                System.out.println("BR");
                break;
            default:
                System.out.println("Girdiginiz ulke ismi tanimli degildir");




        }








    }
}
