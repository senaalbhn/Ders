package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {

        toplama(5,6);

        System.out.println(add(1, 2, 3,5,6,8,9,6,66,3684,6565656,449963,1000,0, 4));


    }
    //Note 1: Bir method parabtezinde birden fazla Varargs kullanilamaz
    //Note 2: Eger bir method parantezinde birden fazla paarametre kullanilacaksa Varargs sonda olmalisir

    public static int add(int b, int c, int... a){
        int sum=0;
        for (int w: a){
            sum=sum+w;
        }
        return sum;
    }


    //Asagidaki gibi farkli methodlar olusturarak is yapamayiz.
    //Cunku farkli sayidaki sayilari toplamak isteyebilir
    //Her ihtimal icin bir method olusturmak mumkun ve mantikli degildir
    //Java farkli sayidaki parametrelerin hepsini kabul edenbir yapi olusturdu
    //Bu yapiya Varargs denir
    //Varargs arkada Array yapisini kullanir


    private static int toplama(int a, int b) {
        return a+b;
    }
    private static int toplama(int a, int b, int c) {
        return a+b+c;
    }
    private static int toplama(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    private static int toplama(int a, int b, int c, int d,int e) {
        return a+b+c+d+e;
    }


}
