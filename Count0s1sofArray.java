package Array;

public class Count0s1sofArray {
    void main(){
        int arr[] = {1,2,0,5,1,6,0,8,1};

        int zeroCount = 0 ;
        int onesCount = 0;

        for(int i=0; i<arr.length ; i++){
            if(arr[i] == 0){
                zeroCount++;
            }else if(arr[i] == 1){
                onesCount++;
            }


        }System.out.println("zeroCount is " + zeroCount + " and onesCount is "+ onesCount + ".") ;
    }
}
