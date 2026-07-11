import java.util.Scanner;

public class tenMultipleOfn {
    void main() {
        System.out.println("10 Multiple of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int multiplyBy10 = i * 10;
            System.out.println(multiplyBy10);

        }
    }
    }
