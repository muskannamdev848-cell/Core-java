package ArrayHardLevel;

import java.util.Arrays;

public class Medianof2sortedarrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        // Merge both arrays
        int[] merged = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort merged array
        Arrays.sort(merged);

        int total = merged.length;

        // Odd number of elements
        if (total % 2 == 1) {
            return (double) merged[total / 2];
        }

        // Even number of elements
        int middle1 = merged[total / 2 - 1];
        int middle2 = merged[total / 2];

        return ((double) middle1 + middle2) / 2.0;
    }

    public static void main(String[] args) {

        Medianof2sortedarrays obj = new Medianof2sortedarrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double result = obj.findMedianSortedArrays(nums1, nums2);

        System.out.println("Median = " + result);
    }
}