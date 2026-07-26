package Inheritance;

public class Main {
    public static void main(String[] args){
       /* Car c = new Car("XUV","7OO",4 , 5,"Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();*/

        MotorCycle m = new MotorCycle("GT" ,"650",2,"U","Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
