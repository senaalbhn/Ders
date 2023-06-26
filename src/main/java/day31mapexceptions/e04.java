package day31mapexceptions;

public class e04 {
    public static void main(String[] args) {

        String arr []= {"J","A","V","A"};
        getElementFromArray(arr,1);//A
        getElementFromArray(arr,5);//Exception



    }
        //Arraylerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar
    private static void getElementFromArray(String[] s, int idx) {

        try {
            String el= s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index disi rakam");
            System.out.println(e.getCause());//null
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
                                //at day31mapexceptions.e04.getElementFromArray(e04.java:17)
                                //at day31mapexceptions.e04.main(e04.java:8)
        }

    }


}
