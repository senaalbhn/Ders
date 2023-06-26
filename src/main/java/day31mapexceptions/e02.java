package day31mapexceptions;

public class e02 {
    public static void main(String[] args) {

        String s= "1234";
        convertStringToInt(s);

        String t="123a";
        convertStringToInt(t);


    }

    private static void convertStringToInt(String s) {
        try {
            Integer intS = Integer.valueOf(s);
            System.out.println(intS + 1);
        } catch (NumberFormatException e){
            System.out.println("Bir String'i sayiya donusturulmesi icin rakam disi karakter icermemelidir");
            System.out.println(e.getMessage());
        }
    }
}
