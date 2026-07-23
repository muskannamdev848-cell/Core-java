package Array;

public class PivotIndex {

    static int getPivotIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            //get the left sum
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + arr[j];
            }
            //get rightsum
            for(int j = i + 1; j < n; j++) {
                rightSum = rightSum + arr[j];
            }

            //check
            if (leftSum == rightSum) {
                return i;
            }

        }
        //no pivot index
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(getPivotIndex(arr));
    }
}























        /*int n = arr.length;

        for (int i = 0; i < n; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Calculate Left Sum
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + arr[j];
            }

            // Calculate Right Sum
            for (int j = i + 1; j < n; j++) {
                rightSum = rightSum + arr[j];
            }

            // Check Pivot Index
            if (leftSum == rightSum) {
                return i;
            }
        }

        // No Pivot Index Found
        return -1;
    }

    static void main() {

        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println("Pivot Index = " + getPivotIndex(arr));
    }
}*/