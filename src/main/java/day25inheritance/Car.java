package day25inheritance;

public class Car extends Vehicle{

    public Car(){
        this("make");
        System.out.println("Car 1");
    }

    public Car(String make){
        super();
        System.out.println("Car 2");
    }

    public String model= "accord";
    public int km=2000;



}
