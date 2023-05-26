package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note: Java "pass by value" sayesinde variable larin orjinaø degerini korur

        int shirtPrice = 100;
        System.out.println(shirtPrice);

        System.out.println("discount student shirtPrice) = " + discount("student", shirtPrice));


    }

    //Discount Methodunu olusturalim
    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }


}


