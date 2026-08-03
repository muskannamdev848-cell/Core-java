package BinarySearch;

public class BStoFindTarget {

    public static void main(String[] args) {

        int[] nums = {10,20,30,40,50,60};

        int start = 0;
        int end = nums.length - 1;
        int target = 50;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                System.out.println("Target found at index : " + mid);
                return;     // ya break;
            }
            else if (target > nums[mid]) {
                //move right
                start = mid + 1;
            }
            else {
                //move left
                end = mid - 1;
            }
        }

        System.out.println("Target not found");
    }
}