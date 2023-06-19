package day26polymorhphism;

public class Student {

    //Encapsulation ==> kapsulleme
    /*
    Encapsulation nedir? Sada Hiding (veri saklama)
    DAta saklama nasil yapilir?
    Access motifierini private yaparak datayi classlardan gorunmez hale getiririm. boylece datayi saklarim
    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz?
    getMethod olusturarark encapsulate yapilmis datanin degerini okuyabiliriz
    1) get methodlar public olur
    2) get methodun return type i okudugu variable in return type i ile ayni olur
    3) get method bir boolen variablesi icin olusturulursa ismi "is" ile baslar
    ornek=>isSuccessful



     */


    private  String stdID="AC2023598645";
    public String stdName= "Ali Can";

    public int age=13;
    private double notOrt=3.13;

    public boolean isSuccessful() {
        return successful;
    }

    private boolean successful= false;

    public double getNotOrt() {
        return notOrt;
    }


    public String getStdID() {
        return stdID;
    }

    /*
    Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirilir?
    "set method" olusturularak encapsulate edilmis datanin degerini degistirebiliriz
    1)set methodlar hep public olur
    2)set methodlarin return type i hep void olur
    3) set methodlar parametre kullanir, parametrenin data typei variable ile ayni olur

    NOT 1: set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki
    yeni bir object'mis gibi kullanabiliriz

    NOT 2: get methodlarin diger adi getter, set methodlarin diger adi setter dir
            getter ve setter larin ikisine birden "Java Beans"   denir     */

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
