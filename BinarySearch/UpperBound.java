package BinarySearch;

public class UpperBound {
    public static void main(String[] args){
        int[] nums ={10,20,30,40,50,60,70,80};
        int n = nums.length;
        int target = 53;

        int start = 0;
        int end = n-1;

        int ans = -1;   //n for all time


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target){
                //move right
                start = mid + 1;
            }
            else if (nums[mid] > target){
                ans = mid;
                //left move
                 end = mid -1;

            }
        }
        System.out.println(ans);
    }
}
