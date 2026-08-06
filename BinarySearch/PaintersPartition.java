package BinarySearch;

public class PaintersPartition {

    // Check whether 'mid' can be the maximum length assigned to one painter
    static boolean isValidAnswer(int[] boards, int k, int mid) {

        int painterCount = 1;
        int paintedLength = 0;

        for (int i = 0; i < boards.length; i++) {

            // Agar ek board hi mid se bada hai
            if (boards[i] > mid) {
                return false;
            }

            // Current painter ye board paint kar sakta hai
            if (paintedLength + boards[i] <= mid) {
                paintedLength += boards[i];
            }
            // Naya painter chahiye
            else {
                painterCount++;

                if (painterCount > k) {
                    return false;
                }

                paintedLength = boards[i];
            }
        }

        return true;
    }

    static int minTime(int[] boards, int k) {

        int n = boards.length;

        if (k > n) {
            return -1;
        }

        int sum = 0;
        int s = 0;

        // Search Space
        for (int i = 0; i < n; i++) {
            sum += boards[i];
            s = Math.max(s, boards[i]);
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAnswer(boards, k, mid)) {
                ans = mid;
                e = mid - 1; // Try smaller answer
            } else {
                s = mid + 1; // Increase answer
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] boards = {10, 20, 30, 40};
        int k = 2;

        System.out.println("Minimum Time = " + minTime(boards, k));
    }
}