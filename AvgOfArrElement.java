package Array;

public class AvgOfArrElement {
    void main(){
        int arr[] ={5,3,4};
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ; i <= n-1 ;i++){
            sum = sum + arr[i];
        }
        int avg = sum /n ;
        System.out.println(avg);

    }
}
