package day32exceptions;

public class E01 {
    public static void main(String[] args) {
        String s= "Java";
        getNumberOfChar(s);

        String t= "";
        getNumberOfChar(t);

        String u= null;
        getNumberOfChar(u);




    }
    //String in degeri null oldugunda String class'indaki bazi methodlari kullanmaya calisirsaniz
    // java NullPointerException atar
    private static void getNumberOfChar(String s) {
        try {
            int numOfChars= s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.out.println("null degeri icin bazi methodlar kullanilamz");
        }
    }
}
