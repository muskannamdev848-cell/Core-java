package ArrayHardLevel;

public class PascalTriangle {

    // Function to compute binomial coefficient (nCr)
    public long findPascalElement(int r, int c) {

        // Pascal element = C(r-1, c-1)
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        // C(n,k)
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int r = 5;
        int c = 3;

        PascalTriangle solution = new PascalTriangle();

        long ans = solution.findPascalElement(r, c);

        System.out.println(ans);
    }
}