package BinarySearch;

public class EKO_SPOJ {

    public static void main(String args[]) {

        int[] trees = {20, 10, 25, 15};
        int m = 7;

        int answer = getSawHeight(trees, m);

        System.out.println("Maximum Saw Height = " + answer);
    }

    static boolean isValidAns(int[] trees, int m, int sawHeight) {

        long totalWoodCollected = 0;

        for (int i = 0; i < trees.length; i++) {

            if (trees[i] > sawHeight) {

                long currentTreeWoodCollected =
                        trees[i] - sawHeight;

                totalWoodCollected += currentTreeWoodCollected;
            }
        }

        return totalWoodCollected >= m;
    }

    static int getSawHeight(int[] trees, int m) {

        int maxi = -1;

        // Find maximum trees height
        for (int i = 0; i < trees.length; i++) {

            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }

        int s = 0;
        int e = maxi;
        int ans = -1;

        // Binary Search
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(trees, m, mid)) {

                ans = mid;

                // Saw height badha sakte hain
                s = mid + 1;

            } else {

                // Saw height kam karna padega
                e = mid - 1;
            }
        }

        return ans;
    }
}