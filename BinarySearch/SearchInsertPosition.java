package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums ={1,2,4,7};

            int target = 6;
            int n = nums.length;
            int start = 0;
            int end = n-1;
            int ans = n;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] >= target){
                    ans = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        System.out.println(ans);
        }
    }

