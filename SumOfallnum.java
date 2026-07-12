import java.util.Scanner;

public class SumOfallnum {
    void main(){
        System.out.println("add till this number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int sum = 0;


        for (int i = 1; i <= n; i++) {
           sum = sum + i;

        }
        System.out.println(sum);

    }
}




