package BinarySearch;

public class PivotIndexOfRotatedArray {
    public static void main(String[] args) {
        int[] nums = {50, 60, 70, 10, 20, 30, 40};
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        if (nums[start] < nums[end]) {
            System.out.println(-1);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= nums[n - 1]) {
                //move left
                end = mid - 1;
            } else if (nums[mid] > nums[n - 1]) {
                ans = mid;
                //move right
                start = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
