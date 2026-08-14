package BinarySearch;

public class findElementNearbySortedArray {

    static int getElementNearSortedArr(int[] arr , int target ){

        int n = arr.length ;
        int s = 0 ;
        int e = n-1;


        while(s <= e){
            int mid = s +(e-s)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(mid+1 >=  0 && arr[mid+1] == target){
                return mid+1;
            }
            if(mid-1 < n && arr[mid-1] == target){
                return mid-1;
            }

            if(target > arr[mid]){
                //move right
                s = mid +2;
            }else {
                //move left
                e = mid -2 ;
            }

        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {10,20,30,40,50,60,70,80};
        int target = 50;
        int ans = getElementNearSortedArr(arr,target);
        System.out.println(ans);

    }
}
