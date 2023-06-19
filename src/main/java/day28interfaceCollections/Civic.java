package day28interfaceCollections;

public class Civic implements Ac, Engine, Security{
    //Interface


    @Override
    public void cool() {
        System.out.println("Civic cools super");
    }

    @Override
    public void run() {
        System.out.println("AC runs super");
    }
}
