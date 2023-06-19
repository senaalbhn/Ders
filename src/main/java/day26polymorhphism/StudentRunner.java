package day26polymorhphism;

public class StudentRunner {

    public static void main(String[] args) {

        Student s1=new Student();
        System.out.println(s1.age);
        System.out.println(s1.stdName);
        System.out.println(s1.getStdID());
        System.out.println(s1.getNotOrt());

        System.out.println("=================================");
        s1.setStdID("MU1234567");
        s1.setNotOrt(4.99);
        s1.setSuccessful(true);
        System.out.println(s1.getStdID());
        System.out.println("Not Ortalamasi = " + s1.getNotOrt());
        System.out.println(s1.isSuccessful());

        System.out.println("=================================");
        s1.setStdID("VH1234567");
        s1.setNotOrt(1.25);
        s1.setSuccessful(false);
        System.out.println(s1.getStdID());
        System.out.println("Not Ortalamasi = " + s1.getNotOrt());
        System.out.println(s1.isSuccessful());


    }
}
