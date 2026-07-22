package Array;

public class TwoSumTarget10 {
    static void gettingSumOfpair(int arr[]){
        for(int i = 0 ; i < arr.length - 1 ; i ++ ){
            for(int j =i+1 ; j < arr.length; j++){

                if(arr[i] + arr[j] == 8){
                    //int ans[] = {arr[i] , arr[j]};
                    //for getting indexes of pair
                    System.out.println("In this index you'll get the sum "+i + ", "+ j);
                   System.out.println(arr[i] + "," + arr[j]);

                }
            }
        }
    }
    static void main(){
        int arr[] = { 2,1,3,5,4,6};
        gettingSumOfpair(arr);

    }
}
