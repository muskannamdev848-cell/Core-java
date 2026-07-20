package Array;

public class FirstUnsortedElementInsideArray {
    void main() {

        int arr[] = {1, 2, 3, 7, 5, 8, 9};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("First Unsorted Element = " + arr[i]);
                //return;   // Stop the program


            }
        }

    }

}
