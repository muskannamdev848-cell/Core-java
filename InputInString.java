package String;

import java.util.Scanner;

public class InputInString {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the String Content :");
        String str1 = sc.nextLine();
        System.out.println("Value of nextLine : " +str1);

        String str2 = sc.next();
        System.out.println("Value of next : " +str2);
        
    }
}
