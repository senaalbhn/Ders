package day32exceptions;

public class E02 {
    /*
    throw keyword bir methodun body si icinde istedigimiz yerde, ostedigimiz kadar ,istedigimiz kosular icin
    Exception atmamizi saglar

    throw kwyword yazdiktan sonra bir exception class objecti olusturur

    Exception class constructor in parantezi icine istedigimiz Exception mesaji yazabiliriz
     */
    public static void main(String[] args) {
        //Birbirine donusturulemeyecek data typlerini donusturmekte israr ederseniz Java ClassCastException atar
        Object obj= 70;
        try {
            String str= (String) obj;
        } catch (ClassCastException e) {
            System.err.println("her data type i her data type a ceviremezsin");
        }
    }
}
