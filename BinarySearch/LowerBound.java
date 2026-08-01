package BinarySearch;

public class LowerBound {
    public static void main(String[] args){
        int[] nums = {12,20,30,30,40,45,60,70};
        int target = 30;

        int n = nums.length ;
        int start= 0 ;
        int end = n - 1;
        int ans = -1;


        while(start <= end){
            int mid = start + (end-start) /2;
            if(nums[mid] >= target){
                ans  = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        System.out.println(ans);
    }
}
