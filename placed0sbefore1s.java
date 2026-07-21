package Array;

import java.util.Scanner;

public class placed0sbefore1s {

    static void get0sbefore1s(int arr[]){
       int n = arr.length;
       int i =0 ;
       int j = n-1;

       while(i < j){
           if(arr[i] == 1 && arr[j] == 0){
               //swap
               arr[i] = 0;
               arr[j] = 1;
           }
           if(arr[i] == 0){
               // i ko aage le jaao
               i++;
           }
           if(arr[j] == 1){
               //j ko decrement kar do
               j--;
           }
       }
    }


    static void main() {

        Scanner sc = new Scanner(System.in);

        //step 1 : take input of array size
        System.out.println("Size of the array :: ");
        int n = sc.nextInt();

        //step 2 : create array
        int arr[] =  new int[n];

        //step 3 : Input array element
        System.out.println("Enter " + n + " element : ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //step 4 : print array
        System.out.println("Array elements : ");
        for(int i = 0 ; i <n ; i++){
            System.out.print(arr[i] + " ");
        }

        get0sbefore1s(arr);
        System.out.println("Array after placing 0s before 1s : ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}
