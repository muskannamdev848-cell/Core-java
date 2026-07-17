package Array;

import java.util.Scanner;

public class ArrayBasics {
    static void main(){
        //taken input

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        //input

        for(int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }
        //print
        System.out.println("Array Contains:: ");
        for(int val: arr) {
            System.out.println(val);
        }

//       /* //declaration
//        int arr[];
//        //allocation
//        arr = new int[5];
//
//        //initialize
//        int brr[] ={10,20,30};
//        //print the value of every index
//
//        *//*System.out.println("Value at 0 index" + brr[0]);
//        System.out.println("Value at 1 index" + brr[1]);
//        System.out.println("Value at 2 index" + brr[2]);*//*
//
//        //print the value of every index using classical loop
//        *//*for(int index = 0 ;index <= arr.length ;index++){
//            System.out.println(brr[index]);*//*
//
//        //print the value of every index using for each loop
//        for(int val : brr){
//            System.out.println(val);*/
        }
}
