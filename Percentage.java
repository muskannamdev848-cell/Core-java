import java.util.Scanner;

public class Percentage {
    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("M1:");
        int M1 = sc.nextInt();

        System.out.println("M2:");
        int M2 = sc.nextInt();

        System.out.println("M3:");
        int M3 = sc.nextInt();

        System.out.println("M4:");
        int M4 = sc.nextInt();

        System.out.println("M5:");
        int M5 = sc.nextInt();


        int totalMax = (M1+M2+M3+M4+M5);

        int min = M1;

        if (M2 < min)
            min = M2;

        if (M3 < min)
            min = M3;

        if (M4 < min)
            min = M4;

        if (M5 < min)
            min = M5;

        int bestFour = totalMax - min;
        double percentage = (bestFour / 400.0) *100;
        System.out.println(percentage);


    }
}
