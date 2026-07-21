package Array;

import java.util.Scanner;

public class FindMissingNumber {
    static int getMissingNum(int arr[]){
        int xorSum = 0;
        //XORsum of given array
        for(int n : arr){
            xorSum = xorSum^n;
        }
        //XOR sum of range
        int n = arr.length;
        for(int i =0 ; i <= n ; i++){
            xorSum = xorSum^i;
        }
        //ans aa jayega
        return xorSum;
    }
    static void main() {

        Scanner sc = new Scanner(System.in);

        // Array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int arr[] = new int[n];

        // Input array
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.println("Array Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Print missing number
        System.out.println("Missing Number = " + getMissingNum(arr));
    }
    }

