package day31mapexceptions;

public class e03 {
    public static void main(String[] args) {
        String s="Java";
        getCharFromString(s,2);//v

        String t="Java";
        getCharFromString(s,4);//Exception
    }

        //Stringlerde var olmayan indexler kullanildiginda java StringIndexOutOfBoundsException atar
    public static void getCharFromString(String s, int idx){
        //try catch yapmanin kisa yolu ==> ctrl+alt+T

        try {
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullanim hatasi yaptiniz");
            System.out.println(e.getMessage());//Hata mesajini yazdirir
            System.out.println(e.getCause());//Tanimliysa hatanin sebebini verir
            e.printStackTrace();//Asagidaki gibi hata kodlarini gosterir
            /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at day31mapexceptions.e03.getCharFromString(e03.java:17)
	at day31mapexceptions.e03.main(e03.java:9)
             */

            System.out.println("Kod calismaya devam etti");
        }


    }

}
