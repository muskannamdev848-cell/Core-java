package Inheritance;

    public class Car extends Vehicle {

        public int noOfDoors;
        public String transmissionType;

        Car(String name,String model,int noOfTyres, int noOfDoors ,String transmission){
            //immidiate parent class ko call karne ke liye super keyword ka use karege
            super(name,model,noOfTyres);  //base class ka constructor call kar rahe he
            this.noOfDoors = noOfDoors;
            this.transmissionType = transmissionType;
            //super.startEngine();   //immediate parent class ki method call karne ke liye .very less used

        }

        public void startAC(){
            System.out.println("Start AC of " +name);
        }
    }

