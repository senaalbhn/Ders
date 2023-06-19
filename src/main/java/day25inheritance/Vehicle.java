package day25inheritance;

public class Vehicle {

    public Vehicle (){

        this(300);
        System.out.println("Vehicle 1");
    }

    public Vehicle (int price){
        System.out.println("Vehicle 2");
    }



}
    /*
    1) Child Class tan bir object olusturdugunuzda Constructorlar en ustteki
    parent classtan baslatilarak alta dogru calisir
    2) Child Classtaki constructor dan Parent Classtaki constructor a gidebilmek icin
    super() kullanilir
    3) Parent classta birden fazla constructor varsa istenilen constructor
    constructor super() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
     */
