package Inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    //Default Constructor
    public Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;

    }

    //Parameterized constructor
    Vehicle(String name , String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;

    }

    ///methods / behaviour
    void startEngine(){
        System.out.println("Engine is starting of " + name + " : " + model);
    }
    void stopEngine(){
        System.out.println("Engine is stopping of " + name + " : " + model);
    }





}
