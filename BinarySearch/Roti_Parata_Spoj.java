package BinarySearch;

public class Roti_Parata_Spoj {

    static boolean isValidAns(int totalParatha, int[] cooks, int timeLimit) {

        int parathaCount = 0;

        for (int i = 0; i < cooks.length; i++) {

            int currentCookRank = cooks[i];

            int timeTaken = 0;
            int j = 1;

            // Current cook kitne parathe bana sakta hai?
            while (true) {

                int currentParathaTime = j * currentCookRank;

                if (timeTaken + currentParathaTime <= timeLimit) {

                    timeTaken += currentParathaTime;
                    parathaCount++;
                    j++;

                } else {
                    break;
                }
            }

            // Required parathe already ban gaye
            if (parathaCount >= totalParatha) {
                return true;
            }
        }

        return false;
    }


    static int getMinMinuteToCookParatha(int[] cooks, int p) {

        // Maximum rank
        int maxRank = -1;

        for (int i = 0; i < cooks.length; i++) {

            if (cooks[i] > maxRank) {
                maxRank = cooks[i];
            }
        }

        // Minimum possible time
        int s = 0;

        // Maximum possible time
        int e = maxRank * (p * (p + 1) / 2);

        int ans = -1;

        // Binary Search
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(p, cooks, mid)) {

                // Valid answer
                ans = mid;

                // Minimum time chahiye,
                // isliye left jao
                e = mid - 1;

            } else {

                // Time kam hai,
                // time badhao
                s = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] ranks = {1, 2, 3, 4};

        int p = 10;

        int answer = getMinMinuteToCookParatha(ranks, p);

        System.out.println("Minimum time = " + answer);
    }
}