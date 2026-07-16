import java.util.Scanner;

public class Array2D {
    public static void main(String args[]){

        //declaration
       int[][] arr;
        //allocation
       arr = new int[3][4];

        //init
        int[][] brr = {
                {1,2},
                {3,4 ,5},
                {4,5,4,5},
                {5,6}
        };
        int rowLength = brr.length;
        //int colLength = brr[0].length; // the value or row = col otherwise use col lenth after gettiong row index
        for(int rowIndex = 0 ; rowIndex <= rowLength-1 ; rowIndex++ ){
            //int colLength = brr[rowIndex].length;
            for(int colIndex = 0 ;colIndex<= brr[rowIndex].length -1  ; colIndex++ ){     //ab ye har jagah travese karne ke liye valid hr no need to write anything extra
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
