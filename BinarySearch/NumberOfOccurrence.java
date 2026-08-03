package BinarySearch;

public class NumberOfOccurrence {
    public static void main(String[] args) {

        int[] nums = {10,20,30,30,30,30,40,50,60};
        int n = nums.length;
        int target = 30;

        // ---------- Lower Bound ----------
        int start = 0;
        int end = n - 1;
        int lowerBound = n;    //agr kewal lower/upper bound nikal rahe hote to -1 le sakte the

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                lowerBound = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Element not found
        if (lowerBound == -1 || nums[lowerBound] != target) {
            System.out.println("Number of Occurrences = 0");
            return;
        }

        // ---------- Upper Bound ----------
        start = 0;
        end = n - 1;
        int upperBound = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                upperBound = mid;
                end = mid - 1;
            }
        }

        // ---------- Number of Occurrences ----------
        int count = upperBound - lowerBound;

        System.out.println("Number of Occurrences = " + count);
    }
}
