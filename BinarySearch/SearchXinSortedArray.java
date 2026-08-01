package BinarySearch;

public class SearchXinSortedArray {

        public int search(int[] nums, int target) {
            int n = nums.length ;
            int start = 0 ;
            int end = n - 1;

            //overflow se bachne ke liye its more safe
            int mid = start +(end - start)/2;
            //int mid = (start + end) / 2;

            // loop kb tk chalega
            while(start <= end){
                //mid equal with target
                if(nums[mid] == target){
                    return mid;
                } else if(target > nums[mid]){    //for right side
                    start = mid + 1;
                }else{
                    end = mid-1;  //for left side array
                }
                //updating mid for the left right side movement
                mid = start +(end - start)/2;
                // mid = (start+end) / 2;


            }
            return -1 ;
        }
    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        SearchXinSortedArray obj = new SearchXinSortedArray();

        int ans = obj.search(nums, target);

        System.out.println("Target found at index: " + ans);
    }


}

