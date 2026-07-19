package Array;

public class MinAndMaxElementInside2Darray {
    void main() {
        int arr[][] = {
                {4,5,-1,1},
                {5,2,3,4,5}
        };

        //Maximum element of 2D array
        int max = arr[0][0];
        for(int i=0; i< arr.length; i++){
            for(int j =0; j<arr[i].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    System.out.println(max);
                }
            }
        }





        //Minimum element of the 2D array
       /* int Min = arr[0][0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < Min) {
                    Min = arr[i][j];
                    System.out.println(Min);
                }
            }
        }*/
    }
}