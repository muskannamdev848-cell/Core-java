package Array;

public class RightShiftElementArray {
    static void rightShiftBy1(int arr[]){
        // step 1: last element ko temp me store karna he
        int n = arr.length;
        int temp = arr[n-1];
        // step 2:loop ka use karege element ko copy karne ke liye arr[i] se arr[i-1] me
        for(int i= n-1 ; i >0 ; i--){
            arr[i] = arr[i-1];
        }
        // step 3:temp ko arr[0] me store kar dege
        arr[0] = temp;
    }
    static void main() {
        int arr[] = {70, 80, 60, 80, 90};
        rightShiftBy1(arr);


        //ek for each loop chalayege or har ek element ko print karege
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
