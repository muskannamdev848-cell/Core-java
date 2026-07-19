package Array;

import java.util.HashMap;

public class getModeOfAnArray {
    static  void getMode(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int i : freq.keySet()){
            System.out.println(i+"->"+freq.get(i));
        }
    }
    static void main(){
        int arr[] = {1,2,1,2,1,2,1,1,1,4,5,4,4,5,4,5,6,6,8,5,5,};
        getMode(arr);

    }
}
