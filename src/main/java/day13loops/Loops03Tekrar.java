package day13loops;

public class Loops03Tekrar {
    public static void main(String[] args) {

        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        // "Pwd12?Ab"  ==> P12?A

        String pwd= "Pwd12?Ab";

        for (int i = 0; i < pwd.length() ; i++) {
            if (pwd.charAt(i)>'a' && pwd.charAt(i)<'z'){
            continue;}
        System.out.print(pwd.charAt(i));
        }
















    }
}
