package Array;

public class MultoOfArrayElements {
    void main(){
        int arr[] = {20,30,40,50};
        int multi= 1;
        int n = arr.length;

        for(int i = 0; i<=n-1 ; i++){
            int ans =arr[i];
            multi = arr[i]*multi;
        }
        System.out.println(multi);
    }
}
