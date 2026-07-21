package Array;

public class UniqueElement {

    static int getUniqueElement(int arr[]){
        int xorSum = 0;

        for(int n : arr){
            xorSum = xorSum ^ n;
        }

        return xorSum;
    }

    static void main(){

        int arr[] = {3,4,4,5,5,6,6,7,7};

        System.out.println("Print Unique Element : " + getUniqueElement(arr));
    }
}