package BinarySearch;

public class KthMissingPositiveNumber {

    // Function to find the k-th missing positive number
    public int missingK(int[] vec, int k) {

        int low = 0;
        int high = vec.length - 1;

        // Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Number of missing positive numbers before vec[mid]
            int missing = vec[mid] - (mid + 1);

            if (missing < k) {
                // Need to search on the right side
                low = mid + 1;
            } else {
                // Need to search on the left side
                high = mid - 1;
            }
        }

        // Answer
        return k + high + 1;
    }

    public static void main(String[] args) {

        int[] vec = {4, 7, 9, 10};
        int k = 4;

        KthMissingPositiveNumber obj = new KthMissingPositiveNumber();

        int ans = obj.missingK(vec, k);

        System.out.println("The missing number is: " + ans);
    }
}