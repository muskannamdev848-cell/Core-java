import java.util.Scanner;

public class TakeIOin2DArray {

    public static void main(String[] args) {

        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("2D Array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}