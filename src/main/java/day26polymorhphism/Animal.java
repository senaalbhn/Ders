package day26polymorhphism;

public class Animal {

    /* 1) Parent class icindeki methodun child class icinde ozellestirerek kullanmaya overridin yapmak denir
       2) Overriding de method signature a dokunulmaz (method signsture= method ismi+parantez)
       3) Private methodlar override edilemezler
       4)Chil class daki methodun access modifier i parent class taki override edilmis(Overriden)
       access modifierdan dar olamaz. Aynisi ya da daha genisi olabilir
       5) Child class da override edilen methodun return type i ile parent taki methodun return typr arasinda "Is A relationship"
       varsa return type degistirilebilir
       6)MEthodun return type i primitive iseoverriding yaparken return type dedistirilemez.
       cunku return type ya ayni olur veya parenttan secilir ama primitiveler arasinda Parent child iliskisi olmadigindan aynisi olmak zorundadir
       7)Childda override edilen methodun return type ile parwent taki methodun return type i arasinda IS A relationship yoksa return type
       DEGISTIRILEMEZ. Mesela; Integer Wrapper classi ile Long Wrapper classi arasinda IS A Relationship yoktur o yuzden degtirilemez
       8) Methodun return type i void ise Overriding yapaken return type degisitirilemez
    9) static methodlar override edilemezler. Cunku static methodlar tum childlar icin ortak methodlardir. Bir chlid bir ortak methodu
    degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu yuzden java static methodlarin override edilmesine mussaade etmez
    10) final methodlar override edilemezler. final methodlarin bodysi degistirilemez ama override ederken
    method body degistiririz bu yuzden java final methodlarin override edilmesine izin vermez
        a) Final keywordunu variable lar ile kullanabilirz
            i)eger variable final ise mutlaka deger atanmalidir
            ii) ilk atanan deger degistirelemez
        b) Final keywordunu method lar ile kullanabilirz
            i)method final ise bodysi degistirilemez
            ii)degistirilemeyince override yapmak mumkun olmaz
        c)  Final keywordunu class lar ile kullanabilirz
            i) class final ise child i olamaz

    Polymorphism = Method overloading + Method overriding
     */
    public void eat(){
        //Parent taki override edilmis eat methoduna overriden method denir
        System.out.println("Animals eat");
    }

    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(Integer a, Integer b){
        return a+b;
    }



}
