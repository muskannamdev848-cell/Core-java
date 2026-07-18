package Array;

public class AlterArrElement{

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        //swap alternate elements
        for (int i = 0; i < arr.length - 1; i = i + 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("Array after swapping:");

        //print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}