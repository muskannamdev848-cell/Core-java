package ArrayHardLevel;

public class LongestConsecutiveSequence {

    // Function to find the (r, c) element of Pascal's Triangle
    public long findPascalElement(int r, int c) {

        // Element is C(r-1, c-1)
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        // Compute C(n, k)
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {

        LongestConsecutiveSequence solution =
                new LongestConsecutiveSequence();

        long result = solution.findPascalElement(5, 3);

        System.out.println(result);
    }
}