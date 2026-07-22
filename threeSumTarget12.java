package Array;

public class threeSumTarget12 {

    static void get3index(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n - 2; i++) {

            for(int j = i + 1; j < n - 1; j++) {

                for(int k = j + 1; k < n; k++) {

                    if(arr[i] + arr[j] + arr[k] == 12) {

                        System.out.println("Index of numbers : "+i + ", " + j + ", " + k);
                        System.out.println("Index values     :" + arr[i] +", " + arr[j] + ", "+ arr[k]);
                    }
                }
            }
        }
    }

    static void main() {

        int arr[] = {2,1,3,5,4,6};

        get3index(arr);
    }
}