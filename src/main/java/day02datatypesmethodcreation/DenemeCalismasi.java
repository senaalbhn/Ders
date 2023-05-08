package day02datatypesmethodcreation;

public class DenemeCalismasi {
    public static void main(String[] args) {

        int sonuc= islemler(5,4,2,1);
        System.out.println(sonuc);

        int cikarmasonuc= cikarma(14562, 54456);
        System.out.println(cikarmasonuc);

        int bolmesonuc= bolme(25,5);
        System.out.println(bolmesonuc);




    }

    public static int islemler ( int a, int b, int c, int d){
        return a*b/c+d;
    }

    private static int cikarma (int a, int b){
        return a-b;
    }

    protected static int bolme (int a, int b){
        return a/b;
    }


}
