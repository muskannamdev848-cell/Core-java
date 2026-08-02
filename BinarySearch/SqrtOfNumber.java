package BinarySearch;

public class SqrtOfNumber {
    static int getNearestIntegerValue(int x){
        int s = 1 ;     //s = 0 is not applicable for every cases
        int e = x;      //1...............................56
        int ans = -1;



        while(s <= e){
            int mid = s + (e-s)/2;

            if(mid > x/mid){
                //move left
                e = mid - 1 ;

            }else if(mid < x/mid){
                //store ans
                ans = mid;
                //move right
                s = mid + 1;
            }else //if(x/mid == mid)
                 {
                return mid;

        }


        }
        return ans;

    }
    public static void main(String[] args){

        //getNearestIntegerValue(56);
        System.out.println(getNearestIntegerValue(56));
    }
}
