package Array;

import java.util.HashMap;

public class getHighestLowestFrequencyElement {

    static int[] getHighestLowestFreq(int arr []) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        //hasmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                //highest ko upgrade karna chahiye
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

            int lowestFreq = Integer.MAX_VALUE;
            int lowestNum = -1;
            for (int key : freq.keySet()) {
                int currentKey = key;
                int currentFreq = freq.get(key);
                if(currentFreq < lowestFreq){
                //its a time to update
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }
    static void main(){
        int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int ans[] = getHighestLowestFreq(arr);

        System.out.println("highest frequency wala number " + ans[0]);
        System.out.println("lowest frequency wala number " + ans[1]);

    }
}
