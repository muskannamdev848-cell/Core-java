public class MaxElementInArray {
    void main(){
        int arr[] = {12,13,-5,14,11};
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i<= n-1 ; i++){
            if(arr[i]>max){
                max = arr[i];

            }
        }
        System.out.println(max);

    }
}
