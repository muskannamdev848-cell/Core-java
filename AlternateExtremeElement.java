package Array;

public class AlternateExtremeElement {
    void main(){
        int arr[] = {4,5,6,6,4,1,7};
        int start = 0;
        int end = arr.length -1;



       while(start <= end){
            if(start == end){
                System.out.println(arr[start] +" ");
            }else{
                System.out.println(arr[start] + " ");

                System.out.println(arr[end] + " ");

            }
            start++;
            end--;

        }
    }
}
