package Array;

public class SumOfArrayElements {

    void main(){
        int arr[] ={1,-2,4,5};
        int sum = 0;
        int n = arr.length;

        for(int i = 0 ; i<=n-1 ;i++ ){
            int ans = arr[i] ;
            sum = sum + ans;

        }
        System.out.println(sum);
    }
}
