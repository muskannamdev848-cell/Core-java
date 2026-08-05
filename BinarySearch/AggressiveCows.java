package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

    // Check if it is possible to place all cows
    // with at least minDistance between them.
    public static boolean isValidAns(int[] stalls, int k, int minDistance) {

        int cowCount = 1;      // First cow is placed at the first stall
        int lastPosition = 0;  // Index of the last placed cow

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - stalls[lastPosition] >= minDistance) {

                cowCount++;
                lastPosition = i;

                if (cowCount == k) {
                    return true;
                }
            }
        }

        return false;
    }

    // Find the maximum minimum distance
    public static int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int start = 0;
        int end = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidAns(stalls, k, mid)) {
                ans = mid;
                start = mid + 1;   // Try for a larger minimum distance
            } else {
                end = mid - 1;     // Reduce the minimum distance
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 8, 4, 9};
        int k = 3;

        int ans = aggressiveCows(stalls, k);

        System.out.println("Maximum Minimum Distance = " + ans);
    }
}