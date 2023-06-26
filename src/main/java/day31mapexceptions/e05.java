package day31mapexceptions;

public class e05 {
    public static void main(String[] args) {
        int a=12;
        int b= 0;
        String s= "Java";

        getCharFromString(s,a,b);

    }

    private static void getCharFromString(String s, int a, int b) {

        try {
            int idx= a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }

        /*
        try kisminda birden fazla Exception olusma ihtimali olan iki kod varsa coklu catch kullanabilirsiniz
        coklu catch kullandigimizda exception classlar arasinda parent-child iliskisi yoksa catchlerin siralamasi onemli degildir
        Ama koddaki siralamaya uymak tavsiye edilir

        Coklu catch kullandiginizda exception classlar arasinda parent-child iliskisivarsa cathlerin sirasi onemlidir
        child olan class ustte olmalidir
         */


    }
}
