package day28interfaceCollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic= new Civic();
        myCivic.cool();
        myCivic.run();

        Accord myAccord= new Accord();
        myAccord.cool();
        myAccord.run();

        System.out.println("Ac price = " + Ac.price);
        System.out.println("Engine price = " + Engine.price);
        System.out.println("Security price = " + Security.price);


    }

}
