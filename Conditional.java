import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditional {
    void main() {

    /*    // if-else-if ladder
        int accuracy = 78;

        if(accuracy >= 90){
            System.out.println("Exellent");
        }else if(accuracy >=80){
            System.out.println("good accuracy");
        }else if(accuracy >= 70){
            System.out.println("okok");
        }else{
            System.out.println("bad accuracy");
        }*/

//...................................................................................................
      /*  //Nested if-else
        boolean hasSubscription = true;
        int solvedProblem = 441;

        if(hasSubscription) {
            if (solvedProblem >= 200) {
                System.out.println("Unlock Advance sheet");
            } else {
                System.out.println("practice more problems");
            }
        }else{
            System.out.println("Upgrade to premium");
        }

    }*/
/*        //...........................................................................................................
        //ternary operator

        int streakDays = 35;                  //for true  : for false
        String status = (streakDays >= 30) ? "consistent" : "irregular";
        System.out.println(status);


    //...............................................................................................................*/
     /*   int age = 34;
        int ans = (age>18) ? 22:12;
        System.out.println(ans);*/
        //...................................................................................................

        //switch cases

        System.out.println("Enter the value for day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Sunday");


        }
    }
}
