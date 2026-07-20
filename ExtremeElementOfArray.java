package Array;

public class ExtremeElementOfArray {
    static void exteremeElement(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n- 1;

        while (i <= j) {
            if( i == j){
                System.out.print(arr[i] + " ");
            }else{
                // i < j
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }

        }
    }

    static void main(){
        int arr[] = {4,5,8,6,7,4,7,4};
        exteremeElement(arr);

        }

    }

