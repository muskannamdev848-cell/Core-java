package String;

public class ComparingStrings {
    void main(){
        /*String name1 ="Muskan";
        String name2 = "Muskan";*/
        /*if(name1==name2){
            System.out.println("Both Strings are equal by based on their References.");
        }*/


/*        //using .equals()
        if(name2.equals(name1)){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equals");
        }*/



        //using.equalsIgnoreCase()  ---> they are ignore the type of cases during the comparision of string

        String name1 = "Satyam";
        String name2 = "SATYAM";
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
