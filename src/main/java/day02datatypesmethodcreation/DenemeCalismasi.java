package day02datatypesmethodcreation;

public class DenemeCalismasi {
    public static void main(String[] args) {

        int sonuc= islemler(5,4,2,1);
        System.out.println(sonuc);

        int cikarmasonuc= cikarma(14562, 54456);
        System.out.println(cikarmasonuc);

        int bolmesonuc= bolme(25,5);
        System.out.println(bolmesonuc);

       int snc=carpma(2,3,4);
        System.out.println("snc = " + snc);

        int sss=nbr(5, 6);
        System.out.println("sss = " + sss);


    }

    private static int nbr(int i, int i1) {
        return i+i1;
    }

    public static int carpma (int d, int f,int g){
        return ((d*f*g)*(d+f+g));}

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
