package Array;

public class ReverseAnArray {
    static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n -1;

        while(i <= j){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            //i ko aage badhao
            i++;
            //j ko peechhe lao
            j--;
        }
        //print reversed array
        for(int k : arr){
            System.out.println(k);
        }
    }

    static void main(){
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);

    }












    /*static void reverseArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            //swaping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            //i ko aage badhao
            i++;
            //j ko peechhe lao
            j--;
        }
        //print reversed of array
        //print
        for (int k : arr) {
            System.out.println(k);
        }
    }
    static void main(){
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);


    }*/
}
