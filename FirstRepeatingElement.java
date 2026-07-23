package Array;

import java.util.HashMap;

public class FirstRepeatingElement {
    static int getFirstRepeatingElement(int[] arr) {

        HashMap<Integer ,Integer> freq = new HashMap<>();
        for(int a : arr) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
        for(int i : arr){
            if(freq.get(i) >1){
                return i ;
            }

    }

        //agr koyi bhi freq > 1 nahi he to
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {5,4,8,4,2,5};
        System.out.println(getFirstRepeatingElement(arr));

    }
}
