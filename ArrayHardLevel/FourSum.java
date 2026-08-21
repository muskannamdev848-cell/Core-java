package ArrayHardLevel;

import java.util.*;

public class FourSum {

    // Function to find all unique quadruplets
    public List<List<Integer>> fourSum(int[] arr, int target) {

        int n = arr.length;

        // To store all unique quadruplets
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Fix the first element
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // Step 3: Fix the second element
            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate elements
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                // Step 4: Use two pointers
                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    // Calculate sum
                    // long is used to avoid integer overflow
                    long sum = (long) arr[i]
                            + arr[j]
                            + arr[left]
                            + arr[right];

                    // If sum is equal to target
                    if (sum == target) {

                        // Store quadruplet
                        List<Integer> temp = Arrays.asList(
                                arr[i],
                                arr[j],
                                arr[left],
                                arr[right]
                        );

                        ans.add(temp);

                        // Skip duplicate left elements
                        while (left < right &&
                                arr[left] == arr[left + 1]) {
                            left++;
                        }

                        // Skip duplicate right elements
                        while (left < right &&
                                arr[right] == arr[right - 1]) {
                            right--;
                        }

                        // Move both pointers
                        left++;
                        right--;
                    }

                    // If sum is smaller than target
                    else if (sum < target) {
                        left++;
                    }

                    // If sum is greater than target
                    else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }

    // Main method
    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 0, -1, 0, -2, 2};

        // Target value
        int target = 0;

        // Create object of FourSum class
        FourSum obj = new FourSum();

        // Call fourSum function
        List<List<Integer>> ans = obj.fourSum(arr, target);

        // Print the result
        System.out.println("Unique Quadruplets:");

        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
}