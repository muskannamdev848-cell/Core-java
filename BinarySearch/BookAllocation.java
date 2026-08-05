package BinarySearch;

public class BookAllocation {

    // Check whether maxPages is a valid answer or not
    static boolean isValidAnswer(int[] arr, int k, int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {

            // Agar current student ko ye book de sakte hain
            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            }
            // Naye student ko allocate karo
            else {
                studentCount++;

                // Agar students khatam ho gaye ya ek book hi maxPages se badi hai
                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    static int findPages(int[] arr, int k) {
        if(arr.length < k){
            return -1;
        }

        int n = arr.length;

        // Agar students books se zyada hain
        if (k > n) {
            return -1;
        }

        int s = 0;
        int sum = 0;

        // Search space
        for (int i = 0; i < n; i++) {
            s = Math.max(s, arr[i]); // Largest book
            sum += arr[i];
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            //is bali condition ke liye brute force hi lagana padega
            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1; // Try smaller answer
            } else {
                s = mid + 1; // Increase answer
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int k = 3;

        System.out.println("Minimum Maximum Pages = " + findPages(arr, k));
    }
}