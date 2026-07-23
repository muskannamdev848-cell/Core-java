package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    static int removeDuplicate(int[] arr) {

        int i = 0;
        int j = 1;

        while (j < arr.length) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        return i + 1;
    }

    static void main() {

        int[] arr = {1,1,2,2,3,4,4,5};

        int newSize = removeDuplicate(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
