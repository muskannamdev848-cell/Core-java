package BinarySearch;

public class Findtherowwithmaximumnumberof1 {

    static class Solution {

        // Function to find the first index where arr[index] >= x
        public int lowerBound(int[] arr, int n, int x) {

            int low = 0;
            int high = n - 1;
            int ans = n;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid] >= x) {
                    ans = mid;
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            return ans;
        }

        // Function to find row with maximum number of 1s
        public int rowWithMax1s(int[][] matrix, int n, int m) {

            int maxCount = 0;
            int rowIndex = -1;

            // Traverse each row
            for (int i = 0; i < n; i++) {

                // Find first occurrence of 1
                int firstOneIndex = lowerBound(matrix[i], m, 1);

                // Number of 1s
                int countOnes = m - firstOneIndex;

                // Update maximum
                if (countOnes > maxCount) {
                    maxCount = countOnes;
                    rowIndex = i;
                }
            }

            return rowIndex;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {0, 0, 1},
                {0, 0, 0}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        Solution obj = new Solution();

        int result = obj.rowWithMax1s(matrix, n, m);

        System.out.println(
                "The row with maximum number of 1's is: " + result
        );
    }
}