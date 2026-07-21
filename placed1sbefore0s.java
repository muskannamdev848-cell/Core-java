package Array;

import java.util.Scanner;

public class placed1sbefore0s {

    static void get1sbefore0s(int arr[]){
        int n = arr.length ;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(arr[i] == 0 && arr[j] == 1){
                //swap
                arr[i] = 1;
                arr[j] = 0;

            }if(arr[i] == 1){
                i++;
            }if (arr[j] == 0){
                j--;
            }
        }
    }


    static void main(){

        Scanner sc = new Scanner(System.in);

        //take input of array size
        System.out.println("Array size is  ");
        int n = sc.nextInt();

        //create array
        int arr[] = new int[n];

        // input array element
        System.out.println("Enter " + n + " elements");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //print array
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }

        get1sbefore0s(arr);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
