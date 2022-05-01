package org.matrix.sigma.niksangli.corejava.block;

public class Bike
{
    static int bikespeed=50;
    String bikecompany="Honda";

    static
    {
        bikespeed=100;
        System.out.println("static block");
    }
    {
        bikespeed=150;
        bikecompany="Hero";
        System.out.println("Non static block");
    }

    public static void main(String[] args) {
        Bike obj=new Bike();
        System.out.println("Bike speed is" +Bike.bikespeed);

        System.out.println("Bike company is" + obj.bikecompany);

        System.out.println("*****Main method ******");

        Bike b2=new Bike();
        Bike b3=new Bike();



    }

}
