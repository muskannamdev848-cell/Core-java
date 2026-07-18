package Array;

import java.util.Scanner;

public class ArrayHW {
    void main(){
        int arr[] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Search this element : ");
        int search = sc.nextInt();
        int n = arr.length;

        //input
        System.out.println("Array Contain ::: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        for(int i =0 ;i < arr.length ; i++){
            if(arr[i] == search){
                search = arr[i];
                System.out.println("Element is found in " + arr[i] );

            }else{
                System.out.println("Element is not found. ");
            }
        }

       /* int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
               max = arr[i];
            }

        } System.out.println(max);*/
        /*int arr [] = {1,2,3};

        for(int i = 0 ; i< arr.length ;i++){

             int finalValue = 10 * arr[i];
            System.out.println(finalValue);
        }*/
    }
}
