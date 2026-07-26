package Inheritance;

public class MotorCycle extends Vehicle {

    public String handleBarType;
    public String suspensionType;

    MotorCycle(String name,String model,int noOfTyres, String handleBarType,String suspensionType){
        super(name,model,noOfTyres);
        this.handleBarType = handleBarType;
        this.suspensionType = suspensionType;
    }
    public void wheelie(){
        System.out.println("MotorCycle is doling wheelieee ! "+name);
    }

}
